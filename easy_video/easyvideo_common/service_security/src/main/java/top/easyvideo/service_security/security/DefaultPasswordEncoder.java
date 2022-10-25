// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_security.security;


import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import top.easyvideo.common_utils.utils.MD5;


/**
 * 密码的处理方法类型
 *
 * @author Lan Sheng
 * @date 2021/10/03
 */
@Component
public class DefaultPasswordEncoder implements PasswordEncoder {

    /**
     * 默认密码编码器
     */
    public DefaultPasswordEncoder() {
        this(-1);
    }

    /**
     * 默认密码编码器
     *
     * @param strength the log rounds to use, between 4 and 31
     */
    public DefaultPasswordEncoder(int strength) {

    }

    /**
     * 编码
     *
     * @param rawPassword 原始密码
     * @return {@link String}
     */
    @Override
    public String encode(CharSequence rawPassword) {
        return MD5.encrypt(rawPassword.toString());
    }

    /**
     * 匹配
     *
     * @param rawPassword     原始密码
     * @param encodedPassword 编码的密码
     * @return boolean
     */
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(MD5.encrypt(rawPassword.toString()));
    }
}
