package com.sleeper.scaffold.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置(脚手架)
 * @author
 * @date 2020-11-30 10:58:35
 **/
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi () {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo () {
        return new ApiInfoBuilder()
                .title(PROJECT_NAME_TITLE)
                .description(PROJECT_NAME_DESCRIPTION)
                .version(PROJECT_VERSION)
                .build();
    }

    private static final String PROJECT_NAME_TITLE = "服务接口文档";
    private static final String PROJECT_NAME_DESCRIPTION = " Swagger API 文档";
    private static final String PROJECT_VERSION = "1.0";
    private static final String BASE_PACKAGE = "com.sleeper";

}