// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_upload.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @program: easyvideo_video
 * @ClassName: UploadService
 * @create: 2021-09-08 02:01
 * @author: Lan Sheng
 * @since： JDK1.8
 * @UploadService: $
 **/
public interface UploadService {
    /**
     * 阿里云上传文件
     *
     * @param file 文件
     * @return {@link String}
     */
    String uploadFile(MultipartFile file);

    /**
     * 七牛云OSS上传
     * @param file
     * @return 地址
     */
    String qiniuOssUploadFile(MultipartFile file);
}
