package com.damar.microservices.bookshop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public static final String TAG_1 = "BookshopApi";

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .tags(new Tag(TAG_1, "Everything related to the Bookshop Api"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.damar.microservices"))
                .paths(PathSelectors.any())
                .build();
    }
}
