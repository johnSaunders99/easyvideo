// Lan Sheng  Copyright (c) 2022 https://127.0.0.1.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.api_video.entity.category;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 水平分类
 *
 * @author TeouBle
 * @date 2021/09/18
 */
@Data
public class LevelCategory {
    /**
     * id
     */
    private String id;
    /**
     * 标题
     */
    private String title;
    /**
     * 孩子们
     */
    private List<LevelCategory> children = new ArrayList<>();
}
