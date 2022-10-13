// Lan Sheng  Copyright (c) 2022 https://easyvideo.top.
// Copyright (c) 2022. easyvideo, personal projects are not allowed to be commercialized without permission.
// Please keep the information of the original author of the code. Thank you

package top.easyvideo.service_base.config;

import com.google.common.base.Predicates;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: easyvideo_viedo
 * @ClassName: SwaggerConfig
 * @create: 2021-09-05 23:01
 * @author: Lan Sheng
 * @since： JDK1.8
 * @SwaggerConfig: api管理$
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket webApiConfig () {
        return new Docket(DocumentationType.SWAGGER_2)
                       .groupName("接口文档在线调试")
                       .apiInfo(webApiInfo())
                       .select()
                       //排除指定的路径 不生成api
                       .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
                       .paths(Predicates.not(PathSelectors.regex("/error.*")))
                       .build();
    }

    private ApiInfo webApiInfo () {
        return new ApiInfoBuilder()
                       .title("视频中心API文档")
                       .description("课程中心微服务接口")
                       .version("1.0")
                       .contact(new Contact("兰生", "https://www.easyvideo.com", "1692700664@qq.com"))
                       .build();
    }

}
