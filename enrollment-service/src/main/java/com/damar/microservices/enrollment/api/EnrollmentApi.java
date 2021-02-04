package com.damar.microservices.enrollment.api;

import com.damar.microservices.enrollment.configuration.SwaggerConfig;
import com.damar.microservices.enrollment.model.EnrollmentResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = {SwaggerConfig.TAG_1})
@RequestMapping("/enrollment-api")
public interface EnrollmentApi {

    @ApiOperation(value = "Retrieve service listening port")
    @GetMapping(value = "/server/port", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<EnrollmentResponse> getHttpPort();
}
