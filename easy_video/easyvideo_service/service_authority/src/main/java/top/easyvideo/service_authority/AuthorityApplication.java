// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_authority;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import top.easyvideo.common_utils.annotation.EnableCustomConfig;
import top.easyvideo.common_utils.annotation.EnableYsFeignClients;

/**
 * @program: easyvideo_video
 * @ClassName: AuthorityApplication
 * @create: 2021-09-27 01:13
 * @author: Lan Sheng
 * @since： JDK1.8
 * @AuthorityApplication: 鉴权$
 **/

@EnableCustomConfig
@EnableYsFeignClients
@SpringCloudApplication
public class AuthorityApplication {

    public static void main (String[] args) {
        SpringApplication.run(AuthorityApplication.class, args);
    }

}
