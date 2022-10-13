/*
 * Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

export function login(data) {
  return request({
    url: '/service_authority/admin/index/login',
    method: 'post',
    data
  })
}

export function getInfo(token) {
  return request({
    url: '/service_authority/admin/index/info',
    method: 'get',
    params: token
  })
}

export function getMoveRouter() {
  return request({
    url: '/service_authority/admin/index/menu',
    method: 'get'
  })
}

export function logout() {
  return request({
    url: '/service_authority/admin/index/logout',
    method: 'post'
  })
}
