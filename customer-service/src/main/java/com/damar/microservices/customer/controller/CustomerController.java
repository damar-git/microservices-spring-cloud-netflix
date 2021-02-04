package com.damar.microservices.customer.controller;

import com.damar.microservices.customer.api.CustomerApi;
import com.damar.microservices.customer.model.CustomerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class CustomerController implements CustomerApi {

    @Value("${server.port}")
    private Integer serverPortNumber;


    @Override
    public ResponseEntity<CustomerResponse> getHttpPort() {
        log.info("HTTP Server Port: {}", serverPortNumber);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(CustomerResponse
                        .builder()
                        .service("Customer Service")
                        .httpPort(serverPortNumber)
                        .build());
    }
}
