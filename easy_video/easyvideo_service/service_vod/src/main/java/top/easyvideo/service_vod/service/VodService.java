// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_vod.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

/**
 * @program: easyvideo_video
 * @ClassName: VodService
 * @create: 2021-09-23 02:44
 * @author: Lan Sheng
 * @since： JDK1.8
 * @VodService: $
 **/

public interface VodService {


    String uploadVideo (MultipartFile file);

    void deleteVideo (String videoId);
}
