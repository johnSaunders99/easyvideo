/*
 * Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
 * Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
 * Please keep the information of the original author of the code. Thank you
 */

import Vue from 'vue'

import 'normalize.css/normalize.css' // A modern alternative to CSS resets

import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'

import '@/styles/index.scss' // global css
import '@/styles/easyvideo.scss' // ruoyi css
import App from './App'
import store from './store'
import router from './router'
import permission from './directive/permission' // 权限校验

import '@/icons' // icon
import '@/permission' // permission control
import {
  parseTime,
  resetForm,
  addDateRange,
  selectDictLabel,
  selectDictLabels,
  download,
  handleTree,
  toMsg
} from '@/utils/easyvideo'
import Pagination from '@/components/Pagination'
import vcolorpicker from 'vcolorpicker'

Vue.prototype.toMsg = toMsg
Vue.prototype.parseTime = parseTime
Vue.prototype.resetForm = resetForm
Vue.prototype.addDateRange = addDateRange
Vue.prototype.selectDictLabel = selectDictLabel
Vue.prototype.selectDictLabels = selectDictLabels
Vue.prototype.download = download
Vue.prototype.handleTree = handleTree

Vue.prototype.msgSuccess = function(msg) {
  this.$message({ showClose: true, message: msg, type: 'success' })
}

Vue.prototype.msgError = function(msg) {
  this.$message({ showClose: true, message: msg, type: 'error' })
}

Vue.prototype.msgInfo = function(msg) {
  this.$message.info(msg)
}

// 全局组件挂载
Vue.component('Pagination', Pagination)

// 挂在全局按钮权限校验
Vue.use(permission)

Vue.use(ElementUI)
// 颜色选择器
Vue.use(vcolorpicker)

Vue.config.productionTip = false

new Vue({
  el: '#app',
  router,
  store,
  render: h => h(App)
})
