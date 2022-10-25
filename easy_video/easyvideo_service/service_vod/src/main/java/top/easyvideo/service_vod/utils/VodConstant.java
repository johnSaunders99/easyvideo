// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_vod.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: easyvideo_video
 * @ClassName: VodConstant
 * @create: 2021-09-23 02:40
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VodConstant: 常量$
 **/

@Component
public class VodConstant implements InitializingBean {

    @Value("${aliyun.keyid}")
    private String keyId;

    @Value("${aliyun.keysecret}")
    private String keySecret;

    public static String ACCESS_KEY_ID;
    public static String ACCESS_KEY_SECRET;

    @Override
    public void afterPropertiesSet() throws Exception {
        ACCESS_KEY_ID = keyId;
        ACCESS_KEY_SECRET = keySecret;
    }
}
