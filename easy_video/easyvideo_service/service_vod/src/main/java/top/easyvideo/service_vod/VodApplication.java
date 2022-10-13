// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_vod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: easyvideo_video
 * @ClassName: VodApplication
 * @create: 2021-09-23 01:03
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VodApplication: 视频点播$
 **/

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
// 开启服务发现/注册
@EnableDiscoveryClient
public class VodApplication {
    public static void main (String[] args) {
        SpringApplication.run(VodApplication.class, args);
    }
}
