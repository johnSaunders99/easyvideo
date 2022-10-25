// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import feign.Param;
import top.easyvideo.api_video.entity.Chapter;

/**
 * <p>
 * 作品章节 Mapper 接口
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-19
 */
public interface ChapterMapper extends BaseMapper<Chapter> {

    Integer getContentOrVideoSortMax (@Param("type") Integer type);
}
