// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_websocket;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.easyvideo.api_websocket.factory.WebSocketFactory;
import top.easyvideo.common_utils.constant.CloudConstant;

/**
 * @program: easyvideo_video
 * @ClassName: RemoteWebsocketClient
 * @create: 2021/10/20:9:59
 * @author: Lan Sheng
 * @desc: api接口|
 **/
@FeignClient(value = CloudConstant.WEBSOCKET, fallbackFactory = WebSocketFactory.class)
public interface RemoteWebsocketClient {
    @GetMapping("/service_websocket/webSocket/sendMessage/{logName}/{msg}")
    public void sendMessage(@PathVariable("logName") String logName, @PathVariable("msg") String msg);
}
