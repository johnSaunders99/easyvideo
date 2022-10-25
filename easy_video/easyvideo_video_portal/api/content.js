/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'


export default {
  getPageList(query) {
    return request({
      url: `/service_video/content/getContentListPage`,
      method: 'get',
      params: query
    })
  },
  //查询所有分类的方法
  getAllCategory() {
    return request({
      url: '/service_video/category/getAllCategory',
      method: 'get'
    })
  },
  // 根据作品id获取作品详情信息
  geContentDetailById(contentId, app) {
    return request({
      url: `/service_video/content/getContentDetailByContentId/${contentId}`,
      method: 'get',
      headers: {
        'token': app.$cookies.get("login_token") || ''
      }
    })
  }
}



