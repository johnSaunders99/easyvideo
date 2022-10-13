// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_upload.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_upload.service.UploadService;

import javax.activation.MimetypesFileTypeMap;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Objects;

/**
 * @program: easyvideo_video
 * @ClassName: UploadController
 * @create: 2021-09-08 01:58
 * @author: Lan Sheng
 * @since： JDK1.8
 * @UploadController: 文件上传$
 **/


@RestController
@Slf4j
@Api(tags = "文件上传")
@RequestMapping("/service_upload/file")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @ApiOperation(value = "oss文件上传")
    @PostMapping("/ossUploadFile")
    public ResponseResult ossUploadFile(MultipartFile file) {
        return ResponseResult.ok().data(uploadService.uploadFile(file));
    }

    @ApiOperation(value = "七牛云文件上传")
    @PostMapping("/qiniuOssUploadFile")
    public ResponseResult qiniuOssUploadFile(MultipartFile file) {
        return ResponseResult.toOk(uploadService.qiniuOssUploadFile(file));
    }


    @ApiOperation(value = "下载模板", notes = "下载模板", httpMethod = "POST")
    @RequestMapping(value = "/downloadTemp", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public void downloadTemp(HttpServletRequest request, HttpServletResponse response, @RequestParam(required = false) String fileName) {
        try {
            fileName = "分类.xlsx";
            //获取资源文件
            ClassPathResource classPathResource = new ClassPathResource("xlsx/" + fileName);
            //设置响应类型
            response.setCharacterEncoding("UTF-8");
            String type = new MimetypesFileTypeMap().getContentType(fileName);
            response.setHeader("content-Type", type);
            // 如果是火狐,解决火狐中文名乱码问题
            if (Objects.equals(getBrowser(request), "FF")) {
                response.setHeader("Content-Disposition",
                        "attachment;fileName=" + new String(fileName.getBytes("UTF-8"), "iso-8859-1"));
            } else {
                response.setHeader("Content-Disposition",
                        "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            }

            //获取资源文件输入流和httpServletResponse的输出流
            try (InputStream inputStream = classPathResource.getInputStream(); ServletOutputStream servletOutputStream = response.getOutputStream()) {
                //把资源文件的二进制流数据copy到response的输出流中
                IOUtils.copy(inputStream, servletOutputStream);
                //清除flush所有的缓冲区中已设置的响应信息至客户端
                response.flushBuffer();
            } catch (Exception e) {
                //错误日志记录
                log.error(e.getMessage());
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }

    // 判断浏览器种类的方法
    private String getBrowser(HttpServletRequest request) {
        String UserAgent = request.getHeader("USER-AGENT").toLowerCase();
        if (UserAgent.contains("msie"))
            return "IE";
        if (UserAgent.contains("firefox"))
            return "FF";
        if (UserAgent.contains("safari"))
            return "SF";
        return null;
    }

}
