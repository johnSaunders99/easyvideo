/*
 * Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'
export default {
  // 1.获取分类数据
  getCategoryData() {
    return request({
      url: `/service_video/category/getAllCategory`,
      method: 'get'
    })
  }
}
