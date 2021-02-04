package com.damar.microservices.customer.api;

import com.damar.microservices.customer.configuration.SwaggerConfig;
import com.damar.microservices.customer.model.CustomerResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = {SwaggerConfig.TAG_1})
@RequestMapping("/customer-api")
public interface CustomerApi {

    @ApiOperation(value = "Retrieve service listening port")
    @GetMapping(value = "/server/port", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CustomerResponse> getHttpPort();
}
