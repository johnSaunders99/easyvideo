// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_websocket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


/**
 * 配置文件
 *
 * @author Lan Sheng
 * @date 2021/10/25
 */
@Configuration
public class WebSocketConfig {


	/**
	 * 给Spring容器注入 ServerEndpointExporter 对象
	 *
	 * @return {@link ServerEndpointExporter}
	 */
	@Bean
	public ServerEndpointExporter serverEndpointExporter() {
		return new ServerEndpointExporter();
	}
}
