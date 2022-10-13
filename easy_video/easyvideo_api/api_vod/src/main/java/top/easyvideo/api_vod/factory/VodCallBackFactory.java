// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_vod.factory;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.easyvideo.api_vod.VodClient;
import top.easyvideo.common_utils.utils.ResponseResult;

/**
 * @program: easyvideo_video
 * @ClassName: VodCallBackFactory
 * @create: 2021-09-25 00:06
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VodFactory: 熔断降级‘$
 **/

@Component
public class VodCallBackFactory implements FallbackFactory<VodClient> {
    private static final Logger log = LoggerFactory.getLogger(VodCallBackFactory.class);

    @Override
    public VodClient create(Throwable cause) {
        log.error("终端检测接口服务调用失败:{}", cause.getMessage());
        return new VodClient() {
            @Override
            public ResponseResult removeVideo(String videoId) {
                return ResponseResult.error().data("远程视频删除失败!");
            }

            @Override
            public ResponseResult testVideo(String videoId) {
                return ResponseResult.error().data("远程视频删除失败!");
            }
        };
    }


}
