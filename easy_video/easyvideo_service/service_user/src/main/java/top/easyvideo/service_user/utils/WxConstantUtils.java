// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_user.utils;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 微信登陆常量
 *
 * @author Lan Sheng
 * @date 2021/10/13
 */
@Component
public class WxConstantUtils implements InitializingBean {
    /**
     * 应用程序id
     */
    @Value("${wx.open.app_id}")
    private String appId;

    /**
     * 应用程序的秘密
     */
    @Value("${wx.open.app_secret}")
    private String appSecret;

    /**
     * 重定向url
     */
    @Value("${wx.open.redirect_url}")
    private String redirectUrl;

    public static String WX_OPEN_APP_ID;
    public static String WX_OPEN_APP_SECRET;
    public static String WX_OPEN_REDIRECT_URL;

    @Override
    public void afterPropertiesSet() throws Exception {
        WX_OPEN_APP_ID = appId;
        WX_OPEN_APP_SECRET = appSecret;
        WX_OPEN_REDIRECT_URL = redirectUrl;
    }
}
