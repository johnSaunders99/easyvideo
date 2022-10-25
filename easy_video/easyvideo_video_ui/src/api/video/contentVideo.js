/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

const apiName = '/service_video/contentVideo'
export default {
  addContentVideo(params) {
    return request({
      url: `${apiName}`,
      method: 'post',
      data: params
    })
  },
  updateContentVideo(params) {
    return request({
      url: `${apiName}`,
      method: 'put',
      data: params
    })
  },
  getContentVideoById(params) {
    return request({
      url: `${apiName}/${params}`,
      method: 'get'
    })
  },
  deleteContentVideoById(id) {
    return request({
      url: `${apiName}/${id}`,
      method: 'delete'
    })
  }
}
