// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_cms.service;

import top.easyvideo.service_cms.entity.Banner;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务类
 * </p>
 *
 * @author easyvideo
 * @since 2021-10-11
 */
public interface BannerService extends IService<Banner> {
    /**
     * 缓存查询所有焦点图
     * @return
     */
    List<Banner> selectAllBanner ();

    /**
     * 编辑焦点图
     */
    boolean updateBanner(Banner banner);

    /**
     * 新增焦点图
     */
    boolean addBanner(Banner crmBanner);

    /**
     * 删除焦点图
     */
    void deleteBanner(String id);
}
