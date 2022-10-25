// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_user.controller;


import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import top.easyvideo.api_user.RemoteUserClient;
import top.easyvideo.api_user.entity.User;
import top.easyvideo.common_utils.utils.JwtUtils;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_base.controller.core.vo.LoginVo;
import top.easyvideo.service_base.controller.core.vo.RegisterVo;
import top.easyvideo.service_base.exception.BusinessException;
import top.easyvideo.service_user.service.UserService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 门户系统 用户密码登陆
 * </p>
 *
 * @author easyvideo
 * @since 2021-10-13
 */
@RestController
@RequestMapping("/service_user/user")
@RequiredArgsConstructor
public class UserController implements RemoteUserClient {
    private final UserService userService;

    @ApiOperation(value = "门户登录")
    @PostMapping("/login")
    public ResponseResult login(@RequestBody LoginVo loginVo) {
        String token = userService.login(loginVo);
        return ResponseResult.ok().data("token", token);
    }

    @ApiOperation(value = "门户注册")
    @PostMapping("/register")
    public ResponseResult register(@RequestBody RegisterVo registerVo) {
        userService.register(registerVo);
        return ResponseResult.ok();
    }

    @ApiOperation(value = "根据token获取门户登录信息")
    @GetMapping("auth/getLoginInfo")
    public ResponseResult getLoginInfo(HttpServletRequest request) {
        try {
            String userId = JwtUtils.getUserIdByJwtToken(request);
            //查询数据库根据用户id获取用户信息
            User user = userService.getById(userId);
            return ResponseResult.ok().data("userInfo", user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessException("获取失败");
        }
    }

    @Override
    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping("getUserInfoOrderById/{id}")
    public User getLoginInfo(@PathVariable String id) {
        return this.userService.getById(id);
    }


}

