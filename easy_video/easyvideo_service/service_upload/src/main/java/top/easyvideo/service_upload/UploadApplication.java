// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: easyvideo_video
 * @ClassName: uploadApplication
 * @create: 2021-09-08 01:51
 * @author: Lan Sheng
 * @since： JDK1.8
 * @uploadApplication: 文件上传服务$
 **/

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class UploadApplication {

    public static void main (String[] args) {
        SpringApplication.run(UploadApplication.class, args);
    }

}
