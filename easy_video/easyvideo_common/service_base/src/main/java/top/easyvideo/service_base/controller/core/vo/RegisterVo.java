// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_base.controller.core.vo;

import lombok.Data;

/**
 * @program: easyvideo_video
 * @ClassName: RegisterVo
 * @create: 2021-10-13 01:08
 * @author: Lan Sheng
 * @since： JDK1.8
 * @RegisterVo: 门户注册$
 **/

@Data
public class RegisterVo {
    /**昵称*/
    private String nickname;
    /**手机号*/
    private String phone;
    /**密码*/
    private String password;
    /**验证码*/
    private String code;
}
