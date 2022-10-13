// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_authority.service;

import top.easyvideo.service_authority.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 角色 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-27
 */
public interface RoleService extends IService<Role> {

    Map<String, Object> findRoleByUserId(String userId);

    /**
     * 根据用户分配角色
     * @param userId userId
     * @param roleId roleId
     */
    void saveUserRoleRelationShip(String userId, String[] roleId);


    /**
     * 选择角色的用户id
     *
     * @param id id
     * @return {@link List<String>}
     */
    List<Role> selectRoleByUserId (String id);
}
