// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_video.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;
import top.easyvideo.api_video.entity.Category;
import top.easyvideo.api_video.entity.category.LevelCategory;

import java.util.List;

/**
 * @program: easyvideo_video
 * @ClassName: CategoryService
 * @create: 2021-09-09 01:09
 * @author: Lan Sheng
 * @since： JDK1.8
 * @CategoryService: ${desc}$
 **/
public interface CategoryService extends IService<Category> {

    void saveCategory (MultipartFile file);

    List<LevelCategory> getTreeCategory ();

}
