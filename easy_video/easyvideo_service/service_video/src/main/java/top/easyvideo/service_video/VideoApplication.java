// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import top.easyvideo.common_utils.annotation.EnableCustomConfig;
import top.easyvideo.common_utils.annotation.EnableYsFeignClients;

/**
 * @program: easyvideo_viedo
 * @ClassName: VideoApplication
 * @create: 2021-09-05 22:27
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VideoApplication: 视频服务入口$
 **/

@EnableCustomConfig
@EnableYsFeignClients
@SpringCloudApplication
public class VideoApplication {

    public static void main (String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }

}
