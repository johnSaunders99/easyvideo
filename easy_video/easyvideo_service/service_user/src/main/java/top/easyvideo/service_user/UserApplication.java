// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_user;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import top.easyvideo.common_utils.annotation.EnableCustomConfig;
import top.easyvideo.common_utils.annotation.EnableYsFeignClients;

/**
 * 用户应用程序
 *
 * @author Lan Sheng
 * @date 2021/10/13
 */
@EnableCustomConfig
@EnableYsFeignClients
@SpringCloudApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
