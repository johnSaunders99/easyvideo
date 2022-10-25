/*------------------------------------------------------------------------------
 -  Lan Sheng  Copyright (c) 2021 https://127.0.0.1.
 -----------------------------------------------------------------------------*/

import { shallowMount } from '@vue/test-utils'
import SvgIcon from '@/components/SvgIcon/index.vue'
describe('SvgIcon.vue', () => {
  it('iconClass', () => {
    const wrapper = shallowMount(SvgIcon, {
      propsData: {
        iconClass: 'test'
      }
    })
    expect(wrapper.find('use').attributes().href).toBe('#icon-test')
  })
  it('className', () => {
    const wrapper = shallowMount(SvgIcon, {
      propsData: {
        iconClass: 'test'
      }
    })
    expect(wrapper.classes().length).toBe(1)
    wrapper.setProps({ className: 'test' })
    expect(wrapper.classes().includes('test')).toBe(true)
  })
})
