// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay.common.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import top.easyvideo.service_pay.common.properties.AliPayProperties;

/**
 * @author Lan Sheng
 * @date 2021/10/23
 */
@Configuration
public class AliPayApiConfig {
    /**
     * 阿里支付属性
     */
    @Autowired
    private AliPayProperties aliPayProperties;
    /**
     * json
     */
    private static final String JSON = "json";
    /**
     * rsa2 加密方式
     */
    private static final String RSA2 = "RSA2";
    /**
     * 字符集
     */
    private static final String CHARSET = "UTF-8";


    /**
     * 获取实例对象
     *
     * @return {@link AlipayClient}
     */
    public AlipayClient getAliPayClient() {
        return new DefaultAlipayClient(
                aliPayProperties.getServerUrl(),
                aliPayProperties.getAppId(),
                aliPayProperties.getPrivateKey(),
                JSON,
                CHARSET,
                aliPayProperties.getPublvicKey(),
                RSA2
        );
    }
}
