// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_security.utils;

import lombok.Data;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @program: easyvideo_video
 * @ClassName: getUserInfo
 * @create: 2021-10-03 21:59
 * @author: Lan Sheng
 * @since： JDK1.8
 * @getUserInfo: 获取当前登陆的用户信息$
 **/
@Data
public class SpringSecurityBean {


    /**
     * 获取用户
     *
     * @return {@link Authentication}
     */
    public static Authentication user () {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    /**
     * 获得用户名
     *
     * @return {@link String}
     */
    public static String userName () {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
