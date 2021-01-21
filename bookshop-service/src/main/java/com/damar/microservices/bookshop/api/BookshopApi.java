package com.damar.microservices.bookshop.api;

import com.damar.microservices.bookshop.configuration.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Api(tags = {SwaggerConfig.TAG_1})
@RequestMapping("/bookshop-api")
public interface BookshopApi {

    @ApiOperation(value = "Retrieve a book")
    @GetMapping(value = "/book/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getBookById(@ApiParam(value = "the book id", required = true)
                                       @PathVariable(value = "id") Long bookId);
}
