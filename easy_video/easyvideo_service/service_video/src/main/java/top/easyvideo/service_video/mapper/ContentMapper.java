// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import top.easyvideo.api_video.entity.Content;
import top.easyvideo.api_video.entity.vo.ContentPreviewVo;
import top.easyvideo.api_video.entity.vo.ContentWebVO;

/**
 * @program: easyvideo_video
 * @ClassName: ContentMapper
 * @create: 2021-09-20 18:49
 * @author: Lan Sheng
 * @since： JDK1.8
 * @ContentMapper: ${desc}$
 **/
public interface ContentMapper extends BaseMapper<Content> {
    ContentPreviewVo getContentPreviewWhitById (@Param("id") String id);

    ContentWebVO getContentDetailById (String id);
}
