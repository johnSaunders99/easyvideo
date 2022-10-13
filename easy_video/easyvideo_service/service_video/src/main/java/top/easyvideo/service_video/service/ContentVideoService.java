// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service;


import com.baomidou.mybatisplus.extension.service.IService;
import top.easyvideo.api_video.entity.ContentVideo;
import top.easyvideo.api_video.entity.vo.ContentVideoInfoVO;

/**
 * 内容视频服务
 * <p>
 * 作品视频 服务类
 * </p>
 *
 * @author easyvideo
 * @date 2021/09/22
 * @since 2021-09-19
 */
public interface ContentVideoService extends IService<ContentVideo> {

    /**
     * 被章id数
     *
     * @param id id
     * @return boolean
     */
    boolean getCountByChapterId (String id);

    /**
     * 添加内容的视频
     *
     * @param contentVideoInfoVO 视频内容信息签证官
     * @return boolean
     */
    boolean addContentVideo (ContentVideoInfoVO contentVideoInfoVO);

    /**
     * 更新内容的视频
     *
     * @param contentVideoInfoVO 视频内容信息签证官
     * @return boolean
     */
    boolean updateContentVideo (ContentVideoInfoVO contentVideoInfoVO);

    /**
     * 删除内容视频丝毫id
     *
     * @param id id
     * @return boolean
     */
    boolean deleteContentVideoWhitById (String id);

    /**
     * 删除内容些微的视频内容id
     *
     * @param id id
     * @return boolean
     */
    boolean deleteContentVideoWhitByContentId (String id);
}
