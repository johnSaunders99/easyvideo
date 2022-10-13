// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_vod;

import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import top.easyvideo.api_vod.factory.VodCallBackFactory;
import top.easyvideo.common_utils.constant.CloudConstant;
import top.easyvideo.common_utils.utils.ResponseResult;

/**
 * @program: easyvideo_video
 * @ClassName: VodClient
 * @create: 2021-09-24 23:42
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VodClient: 视频点播接口$
 **/
@FeignClient(name = CloudConstant.SERVICE_VOD, fallbackFactory = VodCallBackFactory.class)
public interface VodClient {

    /**
     * 删除视频
     *
     * @param videoId 视频id
     * @return {@link ResponseResult}
     */
    @PostMapping("/service_vod/vod/delete-vod/{videoId}")
    public ResponseResult removeVideo (@PathVariable @Param("videoId") String videoId);

    /**
     * 测试远程调用是否联通接口
     * @param videoId
     * @return
     */
    @GetMapping("/service_vod/vod/test-vod/{videoId}")
    public ResponseResult testVideo (@PathVariable @Param("videoId") String videoId);

}
