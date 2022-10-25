/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

// 首页数据
import request from '@/utils/request'
export default {
  getList() {
    return request({
      url: `/service_video/indexPortal/getIndexData`,
      method: 'get'
    })
  }
}
