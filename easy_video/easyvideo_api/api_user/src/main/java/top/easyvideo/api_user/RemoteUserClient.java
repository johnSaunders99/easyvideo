// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.easyvideo.api_user.entity.User;
import top.easyvideo.api_user.factory.RemoteUserFactory;
import top.easyvideo.common_utils.constant.CloudConstant;

/**
 * @program: easyvideo_video
 * @ClassName: RemoteUserClient
 * @create: 2021/10/20:17:10
 * @author: Lan Sheng
 * @desc: api接口|
 **/
@FeignClient(value = CloudConstant.SERVICE_USER, fallbackFactory = RemoteUserFactory.class)
public interface RemoteUserClient {

    /**
     * 根据用户ID获取用户信息
     *
     * @param id
     * @return {@link User}
     */
    @GetMapping("/service_user/user/getUserInfoOrderById/{id}")
    public User getLoginInfo(@PathVariable String id);

}
