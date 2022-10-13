// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * @program: easyvideo_video
 * @ClassName: ContentVideoVO
 * @create: 2021-09-20 20:01
 * @author: Lan Sheng
 * @since： JDK1.8
 * @ContentVideoVO: 章节下小节前端接收参数$
 **/


@Data
public class ContentVideoVO implements Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 小节标题
     */
    private String title;
    /**
     * 小节是否免费
     */
    private Boolean isFree;

    /**
     * 视频源id
     */
    private String videoSourceId;

    /**
     * 持续时间
     */
    private Float duration;


}
