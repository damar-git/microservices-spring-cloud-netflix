package com.damar.microservices.customer.controller;

import com.damar.microservices.customer.api.CustomerApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController implements CustomerApi {

    @Value("${server.port}")
    private String portNumber;

    @Override
    public ResponseEntity<String> getCustomerById(Long customerId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("GET Customer, Port Number: %s", portNumber));
    }

}
