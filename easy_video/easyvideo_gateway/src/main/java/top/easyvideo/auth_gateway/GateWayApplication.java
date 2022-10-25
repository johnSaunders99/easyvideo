// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.auth_gateway;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: easyvideo_video
 * @ClassName: GateWayApplication
 * @create: 2021-09-25 01:56
 * @author: Lan Sheng
 * @since： JDK1.8
 * @GateWayApplication: 网关入口$
 **/
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GateWayApplication {

    public static void main (String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }
}
