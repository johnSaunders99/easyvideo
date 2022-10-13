// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_pay.factory;

import feign.hystrix.FallbackFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import top.easyvideo.api_pay.RemotePayOrderClient;

/**
 * @program: easyvideo_video
 * @ClassName: RemotePayOrderFactory
 * @create: 2021/10/21:18:10
 * @author: Lan Sheng
 * @desc: |
 **/
@Component
public class RemotePayOrderFactory implements FallbackFactory<RemotePayOrderClient> {
    private static final Logger logger = LogManager.getLogger(RemotePayOrderFactory.class);

    @Override
    public RemotePayOrderClient create(Throwable cause) {
        logger.error("支付模块请求失败:{}", cause.getLocalizedMessage());
        return new RemotePayOrderClient() {
            @Override
            public boolean getBuyContent (String userId, String contentId) {
                return false;
            }
        };
    }
}
