// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_authority.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
import java.util.Map;

/**
 * @program: easyvideo_video
 * @ClassName: IndexService
 * @create: 2021-10-03 21:36
 * @author: Lan Sheng
 * @since： JDK1.8
 * @IndexService: $
 **/
public interface IndexService {

    /**
     * 获取用户信息
     *
     * @param username 用户名
     * @return {@link Map<String, Object>}
     */
    Map<String, Object> getUserInfo (String username);

    /**
     * 根据用户名称查询菜单
     *
     * @param username 用户名
     * @return {@link List<JSONObject>}
     */
    List<JSONObject> getMenuByUserName (String username);
}
