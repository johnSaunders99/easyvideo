// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_user.factory;


import feign.hystrix.FallbackFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import top.easyvideo.api_user.RemoteUserClient;
import top.easyvideo.api_user.entity.User;

/**
 * @program: easyvideo_video
 * @ClassName: UserFactory
 * @create: 2021/10/20:17:11
 * @author: Lan Sheng
 * @desc: |
 **/
@Component
public class RemoteUserFactory implements FallbackFactory<RemoteUserClient> {
    private static final Logger logger = LogManager.getLogger(RemoteUserFactory.class);


    @Override
    public RemoteUserClient create (Throwable cause) {
        logger.error("门户用户模块错误:{}", cause.getLocalizedMessage());
        return new RemoteUserClient() {
            @Override
            public User getLoginInfo (String id) {
                return null;
            }
        };
    }
}
