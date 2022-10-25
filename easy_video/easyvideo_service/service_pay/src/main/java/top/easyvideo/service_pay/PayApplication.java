// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_pay;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import top.easyvideo.common_utils.annotation.EnableCustomConfig;
import top.easyvideo.common_utils.annotation.EnableYsFeignClients;

/**
 * @program: easyvideo_video
 * @ClassName: PayApplication
 * @create: 2021-10-20 02:39
 * @author: Lan Sheng
 * @since： JDK1.8
 * @PayApplication: $
 **/



@EnableCustomConfig
@EnableYsFeignClients
@SpringCloudApplication
public class PayApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class, args);
    }
}
