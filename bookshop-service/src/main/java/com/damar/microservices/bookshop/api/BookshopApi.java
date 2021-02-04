package com.damar.microservices.bookshop.api;

import com.damar.microservices.bookshop.configuration.SwaggerConfig;
import com.damar.microservices.bookshop.model.BookshopResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Api(tags = {SwaggerConfig.TAG_1})
@RequestMapping("/bookshop-api")
public interface BookshopApi {

    @ApiOperation(value = "Retrieve service listening port")
    @GetMapping(value = "/server/port", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<BookshopResponse> getHttpPort();
}
