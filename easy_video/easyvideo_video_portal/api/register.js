/*
 * Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

export default {
  //根据手机号发验证码
  sendCode(phone) {
    return request({
      url: `/service_sms/api/sms/send/${phone}`,
      method: 'get'
    })
  },
  //注册的方法
  register(formItem) {
    return request({
      url: `/service_user/user/register`,
      method: 'post',
      data: formItem
    })
  }
}

