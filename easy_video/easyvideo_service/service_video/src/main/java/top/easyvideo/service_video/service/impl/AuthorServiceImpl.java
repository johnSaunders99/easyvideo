// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.util.StringUtils;
import top.easyvideo.api_video.entity.Author;
import top.easyvideo.api_video.entity.vo.AuthorQuery;
import top.easyvideo.service_video.mapper.AuthorMapper;
import top.easyvideo.service_video.service.AuthorService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 创作者 服务实现类
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-05
 */
@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {

    @Override
    public void pageQuery (Page<Author> pageInfo, AuthorQuery authorQuery) {
        QueryWrapper<Author> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("gmt_modified");
        queryWrapper.orderByAsc("sort");
        if (authorQuery == null) {
            //条件查询
            baseMapper.selectPage(pageInfo, queryWrapper);
            return;
        }
        /*有条件 判断条件是否为空*/
        if (!StringUtils.isEmpty(authorQuery.getName())) {
            /*模糊查询name*/
            queryWrapper.like("name", authorQuery.getName());
        }
        if (!StringUtils.isEmpty(authorQuery.getLevel())) {
            queryWrapper.eq("level", authorQuery.getLevel());
        }
        /*查询创建的时间大于等于开始时间*/
        if (!StringUtils.isEmpty(authorQuery.getBegin())) {
            queryWrapper.ge("gmt_create", authorQuery.getBegin());
        }
        /*查询创建的时间在小于等于结束时间*/
        if (!StringUtils.isEmpty(authorQuery.getEnd())) {
            queryWrapper.le("gmt_create", authorQuery.getEnd());
        }
        baseMapper.selectPage(pageInfo, queryWrapper);

    }
}
