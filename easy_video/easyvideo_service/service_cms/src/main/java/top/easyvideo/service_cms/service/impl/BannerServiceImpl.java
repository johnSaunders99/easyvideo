// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_cms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import top.easyvideo.service_cms.entity.Banner;
import top.easyvideo.service_cms.mapper.BannerMapper;
import top.easyvideo.service_cms.service.BannerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 首页banner表 服务实现类
 * </p>
 *
 * @author easyvideo
 * @since 2021-10-11
 */
@Service
public class BannerServiceImpl extends ServiceImpl<BannerMapper, Banner> implements BannerService {

    /**
     * 缓存查询所有焦点图
     *
     * @return
     */
    @Cacheable(value = "banner", key = "'selectIndexList'")
    @Override
    public List<Banner> selectAllBanner () {
        //根据id进行降序排列，显示排列之后前两条记录
        QueryWrapper<Banner> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("id");
        //last方法，拼接sql语句
        wrapper.last("limit 3");
        return baseMapper.selectList(null);
    }

    @Override
    @CacheEvict(value = "banner", allEntries = true)
    public boolean updateBanner(Banner banner){
        return this.updateById(banner);
    }

    @Override
    @CacheEvict(value = "banner", allEntries = true)
    public boolean addBanner(Banner crmBanner) {
        return this.save(crmBanner);
    }

    @Override
    @CacheEvict(value = "banner", allEntries = true)
    public void deleteBanner(String id) {
        this.removeById(id);
    }
}
