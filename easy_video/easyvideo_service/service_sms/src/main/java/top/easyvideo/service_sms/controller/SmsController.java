// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_sms.controller;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_base.exception.BusinessException;
import top.easyvideo.service_base.utils.text.PhoneUtils;
import top.easyvideo.service_sms.service.SmsService;
import top.easyvideo.service_sms.utils.MailUtil;
import top.easyvideo.service_sms.utils.TencentSmsUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @program: easyvideo_video
 * @ClassName: SmsController
 * @create: 2021-10-12 23:43
 * @author: Lan Sheng
 * @since： JDK1.8
 * @SmsController: $
 **/


@RestController
@RequestMapping("/service_sms/api/sms")
@RequiredArgsConstructor
public class SmsController {

    private final SmsService smsService;

    /**
     * 发送完短信后, 把生成的验证码写到redis
     */
    private final RedisTemplate<String, String> redisTemplate;

    /**
     * 根据手机号码发送验证码
     * 阿里云短信验证码
     * @param phone 电话
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "/send/{phone}")
    public ResponseResult send(@PathVariable String phone) {
        // 校验手机号是否合法
        if (!PhoneUtils.isPhone(phone)) {
            throw new BusinessException("手机号码格式出错请重新输入!");
        }
        // 查看redis当中是否有当前手机对应的验证码   手机号当作key
        String code = redisTemplate.opsForValue().get(phone);
        if (!StringUtils.isEmpty(code)) {
            //已经发送过了 还没有过期
            return ResponseResult.ok();
        }
        // 生成新的验证码
        code = randomCode();
        Map<String, Object> param = new HashMap<>();
        //把验证码写到参数当中云
        param.put("code", code);
        //发送短信
        boolean isSend = smsService.send(phone, param);
        //发送成功
        return getResponseResult(phone, code, isSend);
    }


    /**
     * 发送腾讯云短信
     *
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "/send/tencentSms/{phone}")
    public ResponseResult tencentSms(@PathVariable String phone) {
        // 校验手机号是否合法
        if (!PhoneUtils.isPhone(phone)) {
            throw new BusinessException("手机号码格式出错请重新输入!");
        }
        // 查看redis当中是否有当前手机对应的验证码   手机号当作key
        String code = redisTemplate.opsForValue().get(phone);
        if (!StringUtils.isEmpty(code)) {
            //已经发送过了 还没有过期
            return ResponseResult.ok();
        }
        // 生成新的验证码
        code = randomCode();
        //发送短信
        boolean isSend = TencentSmsUtils.sendTencentSms(code, phone);
        return getResponseResult(phone, code, isSend);
    }

    /**
     * 发送邮箱登录信息
     * 参数： to : 接收者邮箱
     * subject: 主题
     * remark: 备注
     *
     * @return {@link ResponseResult}
     */
    @PostMapping(value = "/send/mail")
    public ResponseResult sendMail(@RequestBody Map<String, Object> map) {
        String to = map.get("to").toString();
        String subject = map.get("subject").toString();
        String userName = map.get("userName").toString();
        boolean flag = MailUtil.sendEmail(to, subject, userName, true, "", "博客地址: https://www.easyvideo.top");
        //发送成功
        if (flag) {
            return ResponseResult.ok();
        } else {
            //提示用户失败
            return ResponseResult.error().message("发送失败");
        }
    }


    /**
     * 短信发送返回响应
     *
     * @param phone  手机号码
     * @param code   验证码
     * @param isSend 是否发送成功
     * @return 返回结果
     */
    private ResponseResult getResponseResult(@PathVariable String phone, String code, boolean isSend) {
        //发送成功
        if (isSend) {
            //把验证码写到redis当中 五分钟过期时间
            redisTemplate.opsForValue().set(phone, code, 5, TimeUnit.MINUTES);
            return ResponseResult.ok();
        } else {
            //提示用户失败
            return ResponseResult.error().message("发送短信失败");
        }
    }

    /**
     * 生成4位的数字验证码
     *
     * @return {@link String}
     */
    private String randomCode() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int s = new Random().nextInt(10);
            sb.append(s);
        }
        return sb.toString();
    }


}
