// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service;

import top.easyvideo.common_utils.utils.ResponseResult;
import top.easyvideo.api_video.entity.Content;
import com.baomidou.mybatisplus.extension.service.IService;
import top.easyvideo.api_video.entity.vo.ContentVo;
import top.easyvideo.api_video.entity.vo.ContentWebVO;

import java.util.List;

/**
 * <p>
 * 作品表 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-19
 */

public interface ContentService extends IService<Content> {


    /**
     * 添加内容信息
     *
     * @param categoryVo 类别签证官
     * @return {@link String}
     */
    String addContentInfo (ContentVo categoryVo);

    /**
     * 获取内容一点点信息
     *
     * @param id id
     * @return {@link ContentVo}
     */
    ContentVo getContentWhitInfo (String id);

    /**
     * 更新内容信息
     *
     * @param categoryVo 类别签证官
     * @return boolean
     */
    boolean updateContentInfo (ContentVo categoryVo);

    /**
     * 获取内容预览
     *
     * @param categoryVo 类别签证官
     * @return {@link ResponseResult}
     */
    ResponseResult getContentPreview (String id);

    /**
     * 发送作品
     *
     * @param id id
     * @return {@link ResponseResult}
     */
    ResponseResult sendContent (String id);


    /**
     * 获取内容列表页面
     *
     * @param categoryVo 类别签证官
     * @return {@link ResponseResult}
     */
    ResponseResult getContentListPage (ContentVo categoryVo);


    /**
     * 通过id删除内容
     *
     * @param id
     * @return {@link ResponseResult}
     */
    ResponseResult deleteContentById (String id);

    /**
     * 根据作者ID查拥有的作品
     * @param id
     * @return
     */
    List<Content> selectByAuthorId (String id);

    /**
     * 根据作品ID获取作品详细信息
     * @param contentId
     * @return
     */
    ContentWebVO selectContentDetailById (String contentId);

    /**
     * 更新播放信息
     * @return
     */
    ResponseResult updatePageViewCount (String contentId);
}

