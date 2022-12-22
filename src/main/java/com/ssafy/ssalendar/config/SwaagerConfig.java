package com.ssafy.ssalendar.config;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaagerConfig extends WebMvcConfigurationSupport
{

    // 리소스 핸들러 설정
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {

    }

    // API마다 구분짓기 위한 설정.
//    @Bean
//    public Docket productApi() {
//
//    }

    //swagger 설정
//    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("V2")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ssafy"))
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    //swagger ui 설정
    @Bean
    public UiConfiguration uiConfig(){
        return UiConfigurationBuilder
                .builder()
                .displayRequestDuration(true)
                .validatorUrl("")
                .build();
    }
}
