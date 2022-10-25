// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.common_utils.utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 响应实效
 *
 * @author Lan Sheng
 * @date 2021/10/03
 */
public class ResponseUtil {

    /**
     * 出
     *
     * @param response 响应
     * @param ResponseResult        ResponseResult
     */
    public static void out(HttpServletResponse response, ResponseResult ResponseResult) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.OK.value());
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        try {
            mapper.writeValue(response.getWriter(), ResponseResult);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
