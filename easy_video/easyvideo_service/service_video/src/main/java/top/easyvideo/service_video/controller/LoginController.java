// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.controller;

import org.springframework.web.bind.annotation.*;
import top.easyvideo.common_utils.utils.ResponseResult;

/**
 * @program: easyvideo_video
 * @ClassName: LoginController
 * @create: 2021-09-07 19:14
 * @author: Lan Sheng
 * @since： JDK1.8
 * @LoginController: 登录$
 **/


@RestController
@RequestMapping("/service_video/user")
public class LoginController {

    @PostMapping("/login")
    public ResponseResult login () {
        return ResponseResult.ok().data("token", "admin-token");
    }

    @GetMapping("/info")
    public ResponseResult info () {
        return ResponseResult.ok()
                       .data("roles", "[admin]")
                       .data("name", "fmjava")
                       .data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
}
