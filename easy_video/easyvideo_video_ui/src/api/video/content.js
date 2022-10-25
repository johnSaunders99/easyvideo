/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

export default {
  // 作者全部列表数据
  getAuthorList() {
    return request({
      url: `/service_video/author/getAllAuthorList`,
      method: 'get'
    })
  },
  getContentWhitInfo(params) {
    return request({
      url: `/service_video/content/getContentWhitInfo/${params}`,
      method: 'get'
    })
  },
  addContentInfo(params) {
    return request({
      url: `/service_video/content/addContentInfo`,
      method: 'post',
      data: params
    })
  },
  updateContentInfo(params) {
    return request({
      url: `/service_video/content/updateContentInfo`,
      method: 'post',
      data: params
    })
  },
  getContentPreview(params) {
    return request({
      url: `/service_video/content/getContentPreview/${params}`,
      method: 'post'
    })
  },
  sendContent(params) {
    return request({
      url: `/service_video/content/sendContent/${params}`,
      method: 'post'
    })
  },
  getContentListPage(params) {
    return request({
      url: `/service_video/content/getContentListPage`,
      method: 'get',
      params
    })
  },
  deleteContentById(id) {
    return request({
      url: `/service_video/content/deleteContentById/${id}`,
      method: 'post'
    })
  }
}
