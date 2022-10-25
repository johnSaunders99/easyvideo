// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import top.easyvideo.api_video.entity.vo.BaseVo;

/**
 * @program: easyvideo_video
 * @ClassName: ContentPreviewVo
 * @create: 2021-09-21 09:21
 * @author: Lan Sheng
 * @since： JDK1.8
 * @ContentPreviewVo: 作品预览$
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class ContentPreviewVo extends BaseVo {
    /**
     * 标题
     */
    private String title;
    /**
     * 封面
     */
    private String cover;
    /**
     * 内容num
     */
    private Integer contentNum;
    /**
     * 一个类别
     */
    private String oneCategory;
    /**
     * 两个类别
     */
    private String twoCategory;
    /**
     * 作者
     */
    private String author;
    /**
     * 价格
     */
    private String price;
}
