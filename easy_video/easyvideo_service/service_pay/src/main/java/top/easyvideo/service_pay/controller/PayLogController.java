// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_pay.service.PayLogService;

/**
 * <p>
 * 支付日志表 前端控制器
 * </p>
 * /service_pay/pay-log/aliPay/3861086825764216
 * @author easyvideoya
 * @since 2021-10-20
 */
@Api(tags = "支付log")
@RestController
@RequestMapping("/service_pay/pay-log")
@RequiredArgsConstructor
public class PayLogController {

    private final PayLogService payService;

    @ApiOperation("支付宝电脑支付页面")
    @GetMapping("/aliPay/{orderNo}")
    public ResponseResult aliPay(@PathVariable("orderNo") String orderNo) {
        String form = payService.aliPay(orderNo);
        return ResponseResult.ok().data("form", form);
    }

}

