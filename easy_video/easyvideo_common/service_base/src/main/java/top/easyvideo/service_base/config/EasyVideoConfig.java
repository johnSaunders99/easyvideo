// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_base.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 读取项目相关配置
 *
 * @author easyvideo
 */
@Component
@ConfigurationProperties(prefix = "easyvideo")
public class EasyVideoConfig {
    /**
     * 项目名称
     */
    private static String name;

    /**
     * 版本
     */
    private static String version;

    /**
     * 版权年份
     */
    private static String copyrightYear;

    /**
     * 实例演示开关
     */
    private static boolean demoEnabled;

    /**
     * 上传路径
     */
    private static String profile;

    /**
     * 获取地址开关
     */
    private static boolean addressEnabled;

    /**
     * 日志开关
     */
    private static boolean systemLog;

    /**
     * 腾讯验证码是否打开
     */
    private static String tencentCaptcha;

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        EasyVideoConfig.name = name;
    }

    public static String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        EasyVideoConfig.version = version;
    }

    public static String getCopyrightYear() {
        return copyrightYear;
    }

    public void setCopyrightYear(String copyrightYear) {
        EasyVideoConfig.copyrightYear = copyrightYear;
    }

    public static boolean isDemoEnabled() {
        return demoEnabled;
    }

    public void setDemoEnabled(boolean demoEnabled) {
        EasyVideoConfig.demoEnabled = demoEnabled;
    }

    public static String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        EasyVideoConfig.profile = profile;
    }

    public static boolean isAddressEnabled() {
        return addressEnabled;
    }

    public void setAddressEnabled(boolean addressEnabled) {
        EasyVideoConfig.addressEnabled = addressEnabled;
    }

    public static boolean isSystemLog() {
        return systemLog;
    }

    public void setSystemLog(boolean systemLog) {
        EasyVideoConfig.systemLog = systemLog;
    }

    public static String isTencentCaptcha() {
        return tencentCaptcha;
    }

    public void setTencentCaptcha(String tencentCaptcha) {
        EasyVideoConfig.tencentCaptcha = tencentCaptcha;
    }

    /**
     * 获取头像上传路径
     */
    public static String getAvatarPath() {
        return getProfile() + "/avatar";
    }

    /**
     * 获取下载路径
     */
    public static String getDownloadPath() {
        return getProfile() + "/download/";
    }

    /**
     * 获取上传路径
     */
    public static String getUploadPath() {
        return getProfile() + "/upload";
    }
}

