// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_authority.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.easyvideo.service_authority.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-27
 */
public interface UserService extends IService<User> {

    void selectPage (Page<User> pageParam, User userQueryVo);

    User selectByUsername (String username);
}
