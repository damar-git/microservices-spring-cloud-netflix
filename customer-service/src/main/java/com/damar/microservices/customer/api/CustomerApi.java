package com.damar.microservices.customer.api;

import com.damar.microservices.customer.configuration.SwaggerConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = {SwaggerConfig.TAG_1})
@RequestMapping("/customer-api")
public interface CustomerApi {

    @ApiOperation(value = "Retrieve a customer")
    @GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> getCustomerById(@ApiParam(value = "the customer id", required = true)
                                       @PathVariable(value = "id") Long customerId);
}
