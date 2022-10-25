// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import top.easyvideo.api_video.entity.vo.ContentWebVO;
import top.easyvideo.api_video.factory.RemoteContentClientFactory;
import top.easyvideo.common_utils.constant.CloudConstant;

/**
 * @program: easyvideo_video
 * @ClassName: RemoteContentClient
 * @create: 2021/10/20:17:10
 * @author: Lan Sheng
 * @desc: api接口|
 **/
@FeignClient(value = CloudConstant.SERVICE_VIDEO, fallbackFactory = RemoteContentClientFactory.class)
public interface RemoteContentClient {

    /**
     * 根据作品id查询作品信息
     */
    @GetMapping("/service_video/content/getContentInfoOrder/{id}")
    public ContentWebVO getContentInfoOrder(@PathVariable("id") String id);

}
