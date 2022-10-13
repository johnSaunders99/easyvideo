/*
 * Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

const api_name = '/service_vod/vod'

export default {
  deleteVodById(id) {
    return request({
      url: `${api_name}/delete-vod/${id}`,
      method: 'post'
    })
  }
}
