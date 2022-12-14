// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_sms.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.stereotype.Service;
import top.easyvideo.service_base.utils.text.StringUtils;
import top.easyvideo.service_sms.service.SmsService;
import top.easyvideo.service_sms.constant.SmsConstant;

import java.util.Map;

/**
 * @program: easyvideo_video
 * @ClassName: SmsServiceImpl
 * @create: 2021-10-13 00:02
 * @author: Lan Sheng
 * @since： JDK1.8
 * @SMSServiceImpl: $
 **/
@Service
public class SmsServiceImpl implements SmsService {

    /**
     * 发送短信
     *
     * @param phone 电话号码
     * @param param        参数
     * @return 成功true
     */
    @Override
    public boolean send (String phone, Map<String, Object> param) {
        return sendPhone(phone, "SMS_169111508", param);
    }


    /**
     * 发送短信
     *
     * @param phoneNumbers 电话号码
     * @param templateCode 模板代码
     * @param param        参数
     * @return 成功true
     */
    public static boolean sendPhone (String phoneNumbers, String templateCode, Map<String, Object> param) {
        if (StringUtils.isEmpty(phoneNumbers)) {
            return false;
        }
        DefaultProfile profile = DefaultProfile.getProfile(
                SmsConstant.REGION_ID,
                SmsConstant.ASSESS_KEY_ID,
                SmsConstant.ASSESS_KEY_SECRET);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("PhoneNumbers", phoneNumbers);
        request.putQueryParameter("SignName", "签名");
        request.putQueryParameter("TemplateCode", templateCode);
        request.putQueryParameter("TemplateParam", JSONObject.toJSONString(param));
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}
