// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import top.easyvideo.api_video.entity.Author;
import com.baomidou.mybatisplus.extension.service.IService;
import top.easyvideo.api_video.entity.vo.AuthorQuery;

/**
 * <p>
 * 创作者 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-05
 */
public interface AuthorService extends IService<Author> {

    /**
     * 页面查询
     *
     * @param pageInfo    页面信息
     * @param authorQuery 作者查询
     */
    void pageQuery (Page<Author> pageInfo, AuthorQuery authorQuery);
}
