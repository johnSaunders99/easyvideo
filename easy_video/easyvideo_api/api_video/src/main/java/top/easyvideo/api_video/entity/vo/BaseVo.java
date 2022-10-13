
// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity.vo;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @program: easyvideo_viedo
 * @ClassName: BaseVo
 * @create: 2021-09-07 17:25
 * @author: Lan Sheng
 * @since： JDK1.8
 * @BaseVo: $
 **/
@Data
public class BaseVo implements Serializable {

    @ApiModelProperty(name = "当前页数")
    private Integer page;
    @ApiModelProperty(name = "每页记录数")
    private Integer limit;
    @ApiModelProperty(name = "其他参数")
    private Map<String, Object> params;


}
