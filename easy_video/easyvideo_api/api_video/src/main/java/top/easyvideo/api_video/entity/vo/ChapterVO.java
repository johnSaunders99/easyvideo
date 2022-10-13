// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;
import top.easyvideo.api_video.entity.vo.BaseVo;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: easyvideo_video
 * @ClassName: ChapterVO
 * @create: 2021-09-20 20:01
 * @author: Lan Sheng
 * @since： JDK1.8
 * @ChapterVO: 章节前端接收参数$
 **/


@EqualsAndHashCode(callSuper = true)
@Data
public class ChapterVO extends BaseVo {

    private String id;
    private String title;
    private Integer sort;
    /**
     * 章节下,小节信息
     */
    private List<ContentVideoVO> children = new ArrayList<>();

}
