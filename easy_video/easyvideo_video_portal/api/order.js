/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import request from '@/utils/request'

export default {
  //生成订单
  createOrders(contentId) {
    return request({
      url: '/service_pay/pay-order/createOrderInfo/'+contentId,
      method: 'post'
    })
  },

  //根据订单id查询订单信息
  getOrdersInfo(orderId) {
    return request({
      url: '/service_pay/pay-order/getOrderInfoByOrderNo/'+orderId,
      method: 'get'
    })
  },

  //支付接口
  aliPay(orderNo){
    return request({
      url: '/service_pay/pay-log/aliPay/'+orderNo,
      method: 'get'
    })
  }
}
