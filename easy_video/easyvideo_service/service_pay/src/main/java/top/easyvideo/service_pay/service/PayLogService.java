// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.easyvideo.service_pay.entity.PayLog;

import java.util.Map;

/**
 * <p>
 * 支付日志表 服务类
 * </p>
 *
 * @author easyvideoya
 * @since 2021-10-20
 */
public interface PayLogService extends IService<PayLog> {

    //阿里电脑网站支付
    String aliPay(String orderId);
    //更新订单状态
    boolean updateOrdersStatus(Map<String, String> map);
}
