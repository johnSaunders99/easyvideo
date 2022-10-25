/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'
const api_name = '/service_video/author'

export default {
  authorWebList(page, limit) {
    return request({
      url: `${api_name}/pageList/${page}/${limit}`,
      method: 'post'
    })
  },
  getAuthorById(authorId) {
    return request({
      url: `${api_name}/getAuthorWithId/${authorId}`,
      method: 'get'
    })
  }

}
