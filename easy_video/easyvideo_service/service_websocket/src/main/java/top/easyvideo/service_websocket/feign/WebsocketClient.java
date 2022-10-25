// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_websocket.feign;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.socket.client.WebSocketClient;
import top.easyvideo.api_websocket.RemoteWebsocketClient;
import top.easyvideo.service_websocket.server.WebSocketServer;

/**
 * @program: easyvideo_video
 * @ClassName: WebsocketClient
 * @create: 2021/10/19:16:36
 * @author: Lan Sheng
 * @desc: |
 **/
@RestController
@RequestMapping("/service_websocket/webSocket")
public class WebsocketClient implements RemoteWebsocketClient {

    /**
     * 调用推送消息服务到前端
     */
    @Override
    @GetMapping("sendMessage/{logName}/{msg}")
    public void sendMessage(@PathVariable("logName") String logName, @PathVariable("msg") String msg) {
        WebSocketServer.sendInfo(logName, msg);
    }
}
