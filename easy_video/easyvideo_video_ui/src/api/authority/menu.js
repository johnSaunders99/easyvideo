/*
 * Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

const api_name = '/service_authority/admin/menu'

export default {
  /** 获取所有菜单*/
  getNestedTreeList() {
    return request({
      url: `${api_name}/getMenuList`,
      method: 'post'
    })
  },
  /** 删除菜单*/
  removeById(id) {
    return request({
      url: `${api_name}/removeMenu/${id}`,
      method: 'post'
    })
  },
  /** 保存菜单*/
  saveMenu(menu) {
    return request({
      url: `${api_name}/saveMenu`,
      method: 'post',
      data: menu
    })
  },
  /** 更新菜单*/
  update(menu) {
    return request({
      url: `${api_name}/updateMenu`,
      method: 'post',
      data: menu
    })
  },
  /** 根据角色获取菜单*/
  getMenuWithRoleId(roleId) {
    return request({
      url: `${api_name}/getMenuWithRoleId/${roleId}`,
      method: 'get'
    })
  },
  /** 根据角色分配权限*/
  doAssignRoleAuth(roleId, menu) {
    return request({
      url: `${api_name}/doAssignRoleAuth/${roleId}/${menu}`,
      method: 'post'
    })
  }
}
