// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_user.service;

import top.easyvideo.service_base.controller.core.vo.LoginVo;
import top.easyvideo.service_base.controller.core.vo.RegisterVo;
import top.easyvideo.api_user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-10-13
 */
public interface UserService extends IService<User> {

    /**
     * 用户登录
     *
     * @param loginVo 登录签证官
     * @return 返回登录token
     */
    String login(LoginVo loginVo);

    /**
     * 用户注册
     * @param registerVo
     */
    void register(RegisterVo registerVo);

    /**
     * 根据openId查询用户
     *
     * @param openId 开放id
     * @return {@link User}
     */
    User getByOpenid(String openId);
}
