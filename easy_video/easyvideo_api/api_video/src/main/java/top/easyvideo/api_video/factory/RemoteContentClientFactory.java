// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.factory;

import feign.hystrix.FallbackFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import top.easyvideo.api_video.RemoteContentClient;
import top.easyvideo.api_video.entity.vo.ContentWebVO;

/**
 * @program: easyvideo_video
 * @ClassName: UserFactory
 * @create: 2021/10/20:17:11
 * @author: Lan Sheng
 * @desc: |
 **/
@Component
public class RemoteContentClientFactory implements FallbackFactory<RemoteContentClient> {
    private static final Logger logger = LogManager.getLogger(RemoteContentClientFactory.class);


    @Override
    public RemoteContentClient create (Throwable cause) {
        logger.error("作品模块错误:{}", cause.getLocalizedMessage());
        return new RemoteContentClient() {
            @Override
            public ContentWebVO getContentInfoOrder (String id) {
                return null;
            }
        };
    }
}
