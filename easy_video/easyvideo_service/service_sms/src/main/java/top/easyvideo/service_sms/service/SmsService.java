// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_sms.service;

import org.springframework.cloud.openfeign.FeignClient;

import java.util.Map;

/**
 * @program: easyvideo_video
 * @ClassName: SmsService
 * @create: 2021-10-12 23:44
 * @author: Lan Sheng
 * @since： JDK1.8
 * @SmsService: $
 **/

public interface SmsService {
    /**
     * 短信发送验证码
     * @param phone
     * @param param
     * @return boolean
     */
    boolean send (String phone, Map<String, Object> param);
}
