// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_upload.service.impl;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import com.alibaba.fastjson.JSON;
import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import top.easyvideo.service_upload.service.UploadService;
import top.easyvideo.service_upload.utils.OssConstant;
import top.easyvideo.service_upload.utils.QiniuOssProperties;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.UUID;

/**
 * @program: easyvideo_video
 * @ClassName: UploadServiceImpl
 * @create: 2021-09-08 02:02
 * @author: Lan Sheng
 * @since： JDK1.8
 * @UploadServiceImpl: $
 **/

@Component
@Slf4j
public class UploadServiceImpl implements UploadService {
    @Autowired
    private QiniuOssProperties qiniuOssProperties;

    /**
     * 上传文件
     *
     * @param file 文件
     * @return {@link String}
     */
    @Override
    public String uploadFile(MultipartFile file) {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = OssConstant.ENDPOINT;
        // 云账号AccessKey有所有API访问权限
        String accessKeyId = OssConstant.ASSESS_KEY_ID;
        String accessKeySecret = OssConstant.ASSESS_KEY_SECRET;
        String bucketName = OssConstant.BUCKET_NAME;
        // 创建OSSClient实例。
        OSS ossClient = null;
        try {
            // 创建OSSClient实例。
            ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
            // 上传文件流。
            InputStream inputStream = file.getInputStream();
            //处理文件名称
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            String fileName = uuid + file.getOriginalFilename();

            /*把同一天上传的文件 放到同一个文件夹当中  2020/10/1/fileName*/
            String date = new DateTime().toString("yyyy/MM/dd");
            fileName = date + "/" + fileName;

            ossClient.putObject(bucketName, fileName, inputStream);
            /*
            https://oss-yby.easyvideo.top/2021/09/23/1c1bc81285b743c9acfb786962375a38file.png
            * */
            log.info("文件上次完毕:{}", OssConstant.PATH_NAME + fileName);
            return OssConstant.PATH_NAME + fileName;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭OSSClient。
            ossClient.shutdown();
        }
        return null;
    }

    /**
     * 七牛云OSS上传
     *
     * @param file
     * @return 地址
     */
    @Override
    public String qiniuOssUploadFile(MultipartFile file) {
        //构造一个带指定Region对象的配置类
        Configuration cfg = new Configuration(qiniuOssProperties.getRegion());
        //创建文件上传的管理器
        UploadManager uploadManager = new UploadManager(cfg);
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String fileName = file.getOriginalFilename();
        //统一文件到日文件夹
        String key = DateUtil.today() + "/" + IdUtil.simpleUUID() + "-" + "easyvideoya";
        try {
            byte[] uploadBytes = file.getBytes();
            // 获取文件流
            InputStream input = new ByteArrayInputStream(uploadBytes);
            //创建一个认证的对象
            Auth auth = Auth.create(qiniuOssProperties.getAccessKey(), qiniuOssProperties.getSecretKey());
            //获取token
            String upToken = auth.uploadToken(qiniuOssProperties.getBucket());
            // 需传递token进行文件上传
            Response response = uploadManager.put(input, key, upToken, null, null);
            //解析上传成功的结果
            DefaultPutRet defaultPutRet = JSON.parseObject(response.bodyString(), DefaultPutRet.class);
            // 返回路径
            // qiniuOssProperties.getUrl() + defaultPutRet.hash
            defaultPutRet.key = qiniuOssProperties.getUrl() + defaultPutRet.key;
            defaultPutRet.hash = qiniuOssProperties.getUrl() + defaultPutRet.hash;
            return defaultPutRet.key;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "";
    }

}
