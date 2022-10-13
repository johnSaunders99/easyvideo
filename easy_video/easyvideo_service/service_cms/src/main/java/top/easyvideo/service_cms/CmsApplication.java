// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import top.easyvideo.common_utils.annotation.EnableCustomConfig;
import top.easyvideo.common_utils.annotation.EnableYsFeignClients;

/**
 * @program: easyvideo_video
 * @ClassName: CmsApplication
 * @create: 2021-10-11 23:16
 * @author: Lan Sheng
 * @since： JDK1.8
 * @CmsApplication: $
 **/


@EnableCustomConfig
@EnableYsFeignClients
@SpringCloudApplication
public class CmsApplication {
    public static void main (String[] args) {
        SpringApplication.run(CmsApplication.class, args);
    }
}

