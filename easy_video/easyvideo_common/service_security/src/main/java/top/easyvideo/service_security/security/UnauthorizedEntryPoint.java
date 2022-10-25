// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_security.security;


import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.common_utils.utils.ResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 未经授权的入口点
 * 未授权的统一处理方式
 * @author Lan Sheng
 * @date 2021/10/03
 */
public class UnauthorizedEntryPoint implements AuthenticationEntryPoint {


    /**
     * 授权失败调用
     *
     * @param request       请求
     * @param response      响应
     * @param authException 身份验证异常
     * @throws IOException      ioexception
     * @throws ServletException servlet异常
     */
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException, ServletException {
        authException.printStackTrace();
        ResponseUtil.out(response, ResponseResult.error(authException.getLocalizedMessage()));
    }
}

