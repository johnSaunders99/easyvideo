// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_sms.constant;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @program: easyvideo_video
 * @ClassName: smsConstant
 * @create: 2021-09-08 01:56
 * @author: Lan Sheng
 * @since： JDK1.8
 * @OSSConstant: 阿里云短信发送$读取配置的属性信息
 **/

@Component
public class SmsConstant implements InitializingBean {

    /**
     * 地区
     */
    @Value("${aliyun.regionId}")
    private String regionId;

    /**
     * 访问密钥id
     */
    @Value("${aliyun.accessKey}")
    private String accessKeyId;

    /**
     * 访问密钥的秘密
     */
    @Value("${aliyun.accessSecret}")
    private String accessKeySecret;


    /**
     * 地区
     */
    public static String REGION_ID;

    /**
     * 评估关键id
     */
    public static String ASSESS_KEY_ID;
    /**
     * 评估关键秘密
     */
    public static String ASSESS_KEY_SECRET;

    /**
     * 在属性文件加载完毕后属性也设置完毕之后, 会自动调用
     *
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet () throws Exception {
        REGION_ID = regionId;
        ASSESS_KEY_ID = accessKeyId;
        ASSESS_KEY_SECRET = accessKeySecret;
    }
}
