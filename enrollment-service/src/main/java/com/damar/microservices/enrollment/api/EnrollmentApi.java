package com.damar.microservices.enrollment.api;

import com.damar.microservices.enrollment.configuration.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = {SwaggerConfig.TAG_1})
@RequestMapping("/enrollment-api")
public interface EnrollmentApi {

    @ApiOperation(value = "Signup to platform")
    @GetMapping(value = "/signup/{username}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> signUp(@ApiParam(value = "the customer username", required = true)
                                           @PathVariable(value = "username") String customerId);
}
