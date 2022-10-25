// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_authority.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_authority.entity.Menu;
import top.easyvideo.service_authority.service.MenuService;

/**
 * <p>
 * 菜单权限 前端控制器
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-27
 */
@Api(tags = "菜单管理")
@RestController
@RequestMapping("/service_authority/admin/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @ApiModelProperty(value = "获取菜单列表")
    @PostMapping("/getMenuList")
    public ResponseResult getMenuList () {
        return ResponseResult.ok().data(menuService.getMenuList());
    }

    @ApiModelProperty(value = "根据ID删除所有子节点菜单")
    @PostMapping("/removeMenuById/{id}")
    public ResponseResult removeMenuById (@PathVariable String id) {
        return menuService.removeMenuById(id);
    }

    @ApiModelProperty(value = "根据角色获取菜单")
    @GetMapping("/getMenuWithRoleId/{roleId}")
    public ResponseResult getMenuWithRoleId (@PathVariable String roleId) {
        return ResponseResult.ok().data(menuService.selectMenuByRoleId(roleId));
    }

    @ApiModelProperty(value = "给角色分配菜单权限")
    @PostMapping("/doAssignRoleAuth/{roleId}/{menuIds}")
    public ResponseResult doAssignRoleAuth (@PathVariable String roleId, @PathVariable String... menuIds) {
        return menuService.saveRoleMenuRelationShip(roleId, menuIds);
    }

    @ApiModelProperty(value = "新增菜单")
    @PostMapping("/saveMenu")
    public ResponseResult save (@RequestBody Menu menu) {
        return ResponseResult.toOk(menuService.save(menu));
    }

    @ApiModelProperty(value = "修改菜单")
    @PostMapping("/updateMenu")
    public ResponseResult updateById (@RequestBody Menu menu) {
        return ResponseResult.toOk(menuService.updateById(menu));
    }
}

