// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import top.easyvideo.api_pay.RemotePayOrderClient;
import top.easyvideo.common_utils.utils.JwtUtils;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_pay.service.PayOrderService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 订单 前端控制器
 * </p>
 *
 * @author easyvideoya
 * @since 2021-10-20
 */
@Api(tags = "支付管理")
@RestController
@RequestMapping("/service_pay/pay-order")
@RequiredArgsConstructor
public class PayOrderController implements RemotePayOrderClient {

    private final PayOrderService payOrderService;

    @ApiOperation(value = "创建用户订单")
    @PostMapping("createOrderInfo/{contentId}")
    public ResponseResult createOrderInfo(@PathVariable String contentId, HttpServletRequest request) {
        try {
            return payOrderService.createOrderInfo(contentId, JwtUtils.getUserIdByJwtToken(request));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseResult.error("创建用户订单失败");
        }
    }

    @ApiOperation(value = "根据订单编号查询订单信息")
    @GetMapping("getOrderInfoByOrderNo/{orderNo}")
    public ResponseResult getOrderInfoByOrderNo(@PathVariable String orderNo) {
        return ResponseResult.ok().data(payOrderService.getOrderInfoByOrderNo(orderNo));
    }

    @ApiOperation(value = "根据用户ID获取拥有的订单信息")
    @GetMapping("getOrdersByUserId")
    public ResponseResult getOrdersByUserId (HttpServletRequest request) {
        return payOrderService.getOrdersByUserId(JwtUtils.getUserIdByJwtToken(request));
    }

    @Override
    @ApiOperation(value = "根据用户ID和作品ID查询是否购买改作品")
    @GetMapping("getBuyContent/{userId}/{contentId}")
    public boolean getBuyContent(@PathVariable String userId, @PathVariable String contentId) {
        return payOrderService.getBuyContentStatus(userId, contentId);
    }

}

