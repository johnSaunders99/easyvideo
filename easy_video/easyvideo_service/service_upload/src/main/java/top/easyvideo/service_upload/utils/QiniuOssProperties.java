// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.// Please keep the information of the original author of the code. Thank youpackage top.easyvideo.service_upload.utils;import com.qiniu.storage.Region;import lombok.Data;import org.springframework.boot.context.properties.ConfigurationProperties;import org.springframework.stereotype.Component;/** * @program: easyvideo_video * @ClassName: qiniuOssConstant * @create: 2022/2/24:13:37 * @author: Lan Sheng * @desc: |七牛云文件上传配置 **/@Data@Component@ConfigurationProperties(prefix = "qiniu")public class QiniuOssProperties {    //声明机房的区域 华东    private Region region = Region.huadong();    //AK    private String accessKey = "mcRCcwC8D5mRFy45l7olCBvdsSb3-TTfx13CjWVt";    //SK    private String secretKey = "lMXxgQnvXSOzbpqBJ8_PWmOvA8EZM1ZBX_M-JdFS";    //空间名称    private String bucket = "yby-blog";    //请求地址    private String url = "https://qiniu.easyvideo.top/";}