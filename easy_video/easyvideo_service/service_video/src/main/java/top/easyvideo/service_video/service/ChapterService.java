// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service;

import com.baomidou.mybatisplus.extension.service.IService;
import top.easyvideo.api_video.entity.Chapter;
import top.easyvideo.api_video.entity.vo.ChapterVO;

import java.util.List;

/**
 * <p>
 * 作品章节 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-19
 */
public interface ChapterService extends IService<Chapter> {

    List<ChapterVO> getChapterContentVideo (String contentId);

    boolean deleteChapterById (String id);

    Integer getContentOrVideoSortMax (Integer type);

    boolean deleteChapterByContentId (String id);
}
