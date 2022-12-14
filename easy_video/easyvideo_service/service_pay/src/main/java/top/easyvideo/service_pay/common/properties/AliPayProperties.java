// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay.common.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 阿里支付属性
 *
 * @author Lan Sheng
 * @date 2021/10/23
 */
@Data
@Component
@ConfigurationProperties(prefix = "pay.alibaba")
public class AliPayProperties {
    /**
     * 应用程序id
     */
    private String appId;
    /**
     * 私钥
     */
    private String privateKey;
    /**
     * 公钥
     */
    private String publvicKey;
    /**
     * 支付宝服务地址
     */
    private String serverUrl;
    /**
     * 回调地址
     */
    private String returnUrl;
    /**
     * 异步回调
     */
    private String notyfyUrl;

    /**
     * 支付完毕跳转到前端购买界面
     */
    private String frontUrl;
}
