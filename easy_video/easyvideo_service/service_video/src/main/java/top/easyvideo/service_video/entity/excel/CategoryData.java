// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.entity.excel;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @program: easyvideo_video
 * @ClassName: CategoryData
 * @create: 2021-09-09 01:10
 * @author: Lan Sheng
 * @since： JDK1.8
 * @CategoryData: $
 **/
@Data
public class CategoryData {

    @ExcelProperty(index = 0)
    private String oneCategoryData;

    @ExcelProperty(index = 1)
    private String twoCategoryData;

}
