// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 作品简介
 * </p>
 *
 * @author easyvideo
 * @since 2021-09-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("video_content_description")
@ApiModel(value="ContentDescription对象", description="作品简介")
public class ContentDescription implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "作品ID")
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    @ApiModelProperty(value = "作品简介")
    private String description;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;


}
