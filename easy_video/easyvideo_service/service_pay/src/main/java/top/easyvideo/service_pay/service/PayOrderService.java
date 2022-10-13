// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay.service;

import top.easyvideo.api_user.entity.User;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_pay.entity.PayOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 订单 服务类
 * </p>
 *
 * @author easyvideoya
 * @since 2021-10-20
 */
public interface PayOrderService extends IService<PayOrder> {

    /**
     * 创建用户订单模块
     *
     * @return {@link User}
     */
    ResponseResult createOrderInfo(String contentId, String userIdByJwtToken);

    /**
     * 根据订单编号获取订单详情
     * @return ResponseResult
     */
    PayOrder getOrderInfoByOrderNo(String orderNo);

    /**
     * 根据用户ID和作品ID查询是否购买改作品
     * @return boolean
     */
    boolean getBuyContentStatus(String userId, String contentId);

    /**
     * 根据用户ID获取拥有的订单信息
     *
     * @param userIdByJwtToken jwt用户id的令牌
     * @return {@link ResponseResult}
     */
    ResponseResult getOrdersByUserId (String userIdByJwtToken);
}
