// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_websocket.factory;


import feign.hystrix.FallbackFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import top.easyvideo.api_websocket.RemoteWebsocketClient;

/**
 * @program: easyvideo_video
 * @ClassName: WebSocketFactory
 * @create: 2021/10/20:10:00
 * @author: Lan Sheng
 * @desc: |
 **/
@Component
public class WebSocketFactory implements FallbackFactory<RemoteWebsocketClient> {
    private static final Logger logger = LogManager.getLogger(WebSocketFactory.class);

    @Override
    public RemoteWebsocketClient create (Throwable cause) {
        logger.error("websocket服务模块错误:{}", cause.getLocalizedMessage());
        return new RemoteWebsocketClient() {
            @Override
            public void sendMessage (String logName, String msg) {

            }
        };
    }
}
