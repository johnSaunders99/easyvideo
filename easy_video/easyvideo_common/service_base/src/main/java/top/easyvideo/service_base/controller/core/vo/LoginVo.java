// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_base.controller.core.vo;

import lombok.Data;

/**
 * @program: easyvideo_video
 * @ClassName: LoginVo
 * @create: 2021-10-13 01:07
 * @author: Lan Sheng
 * @since： JDK1.8
 * @LoginVo: 门户页面登陆$
 **/

@Data
public class LoginVo {
    /**手机号*/
    private String phone;
    /**密码*/
    private String password;
}

