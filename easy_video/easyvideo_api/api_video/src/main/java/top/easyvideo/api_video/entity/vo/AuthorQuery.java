// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: easyvideo_viedo
 * @ClassName: AuthorQuery
 * @create: 2021-09-05 23:19
 * @author: Lan Sheng
 * @since： JDK1.8
 * @AuthorQuery: 前端接收参数$
 **/

@EqualsAndHashCode(callSuper = true)
@Data
public class AuthorQuery extends BaseVo{

    private String name;
    private Integer level;
    private String begin;
    private String end;

}

