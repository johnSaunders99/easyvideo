/*
 * Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import hasRole from './hasRole'
import hasPermi from './hasPermi'

/**
 * 设置属性名称
 * @param Vue
 */
const install = function(Vue) {
  Vue.directive('hasRole', hasRole)
  Vue.directive('hasPer', hasPermi)
}

if (window.Vue) {
  window['hasRole'] = hasRole
  window['hasPer'] = hasPermi
  Vue.use(install); // eslint-disable-line
}

export default install
