// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_pay;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.easyvideo.api_pay.factory.RemotePayOrderFactory;
import top.easyvideo.common_utils.constant.CloudConstant;

/**
 * @program: easyvideo_video
 * @ClassName: RemotePayOrderClient
 * @create: 2021/10/21:18:10
 * @author: Lan Sheng
 * @desc: api接口|
 **/
@FeignClient(value = CloudConstant.SERVICE_PAY, fallbackFactory = RemotePayOrderFactory.class)
public interface RemotePayOrderClient {

    /**
     * 得到购买内容
     * 根据用户ID和作品ID查询是否购买改作品
     *
     * @param userId    用户id
     * @param contentId 内容识别
     * @return boolean
     */
    @GetMapping("/service_pay/pay-order/getBuyContent/{userId}/{contentId}")
    public boolean getBuyContent(@PathVariable @Param("userId") String userId, @PathVariable @Param("contentId") String contentId);
}
