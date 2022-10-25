// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service;

import top.easyvideo.api_video.entity.Author;
import top.easyvideo.api_video.entity.Category;
import top.easyvideo.api_video.entity.Content;

import java.util.List;

/**
 * @program: easyvideo_video
 * @ClassName: IndexPortalService
 * @create: 2021-10-12 00:07
 * @author: Lan Sheng
 * @since： JDK1.8
 * @IndexPortalService: $
 **/
public interface IndexPortalService {

    /**
     * 作品数据
     * @return
     */
    List<Content> getContentIndexList ();


    /**
     * 作者数据
     * @return
     */
    List<Author> getAuthorIndexList ();


    /**
     * 分类数据
     * @return
     */
    List<Category> getCategoryIndexList ();
}
