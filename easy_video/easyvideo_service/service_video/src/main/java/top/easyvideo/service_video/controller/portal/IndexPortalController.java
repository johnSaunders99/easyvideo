// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.controller.portal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.service_video.service.IndexPortalService;

/**
 * @program: easyvideo_video
 * @ClassName: IndexPortalController
 * @create: 2021-10-12 00:05
 * @author: Lan Sheng
 * @since： JDK1.8
 * @IndexPortalController: 前端门户页面数据$获取视频播放
 **/


@RestController
@Slf4j
@RequestMapping("/service_video/indexPortal")
@RequiredArgsConstructor
public class IndexPortalController {

    /**
     * 索引门户服务
     */
    private final IndexPortalService indexPortalService;

    /**
     * 加载门户首页数据
     *
     * @return {@link ResponseResult}
     */
    @GetMapping("/getIndexData")
    public ResponseResult getIndexData() {
        return ResponseResult.ok().data("contentList",indexPortalService.getContentIndexList())
                       .data("authorList",indexPortalService.getAuthorIndexList())
                       .data("categoryList",indexPortalService.getCategoryIndexList());
    }

}
