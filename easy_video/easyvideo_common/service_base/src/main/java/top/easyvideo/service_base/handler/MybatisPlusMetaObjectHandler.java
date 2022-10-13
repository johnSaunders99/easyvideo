// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_base.handler;


import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: easyvideo_viedo
 * @ClassName: MetaObjectHandler
 * @create: 2021-09-07 16:30
 * @author: Lan Sheng
 * @since： JDK1.8
 * @MetaObjectHandler: 自动填充$
 **/

@Component
@Slf4j
public class MybatisPlusMetaObjectHandler implements MetaObjectHandler {

    /**
     * 新增时自动填充该字段数据
     *
     * @param metaObject
     */
    @Override
    public void insertFill (MetaObject metaObject) {
        log.info("字段数据填充配置");
        this.setFieldValByName("gmtCreate", new Date(), metaObject);
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }

    /**
     * 更新时填充字段
     *
     * @param metaObject
     */
    @Override
    public void updateFill (MetaObject metaObject) {
        this.setFieldValByName("gmtModified", new Date(), metaObject);
    }
}

