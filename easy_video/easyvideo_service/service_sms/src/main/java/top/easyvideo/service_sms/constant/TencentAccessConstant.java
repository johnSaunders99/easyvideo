// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_sms.constant;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @program: easyvideo_video
 * @ClassName: VodConstant
 * @create: 2021-09-23 02:40
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VodConstant: 常量$腾讯账户
 **/

@Component
@RefreshScope
public class TencentAccessConstant implements InitializingBean {

    /**
     * 应用APPID
     */
    @Value("${tencent.smsSdkAppId}")
    private String smsSdkAppId;

    /**
     * 短信签名名称
     */
    @Value("${tencent.signName}")
    private String signName;

    /**
     * 正文模板ID
     * 短信发送之类需要
     */
    @Value("${tencent.templateId}")
    private String templateId;

    /**
     * 腾讯云access key
     */
    @Value("${tencent.accessKey}")
    private String keyId;

    /**
     * 腾讯云key 密钥访问秘密
     */
    @Value("${tencent.accessSecret}")
    private String keySecret;

    public static String SMS_SDK_APP_ID;
    public static String SIGN_NAME;
    public static String TEMPLATE_ID;
    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;

    @Override
    public void afterPropertiesSet() throws Exception {
        smsSdkAppId = SMS_SDK_APP_ID;
        signName = SIGN_NAME;
        templateId = TEMPLATE_ID;
        ACCESS_KEY_ID = keyId;
        ACCESS_KEY_SECRET = keySecret;
    }
}
