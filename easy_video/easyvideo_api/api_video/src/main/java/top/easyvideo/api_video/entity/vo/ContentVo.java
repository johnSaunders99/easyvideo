// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you
package top.easyvideo.api_video.entity.vo;

import io.swagger.annotations.Api;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import top.easyvideo.api_video.entity.vo.BaseVo;

import java.math.BigDecimal;


/**
 * @program: easyvideo_video
 * @ClassName: Content
 * @create: 2021-09-19 21:33
 * @author: Lan Sheng
 * @since： JDK1.8
 * @Content: 作品接收类$
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Api(tags = "作品前端接收类")
public class ContentVo extends BaseVo {

    /**
     * id
     */
    private String id;

    /**
     * 标题
     */
    private String title;
    /**
     * 分类ID
     */
    private String categoryId;
    /**
     * 父级分类ID
     */
    private String categoryParentId;
    /**
     * 作者id
     */
    private String authorId;
    /**
     * 总视频数
     */
    private Integer contentNum;
    /**
     * 简介
     */
    private String description;
    /**
     * 封面
     */
    private String cover;
    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 类型 1 销量排序  2 最新排序 3 价格排序
     */
    private Integer type;

}
