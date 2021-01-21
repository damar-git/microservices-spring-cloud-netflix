package com.damar.microservices.enrollment.controller;

import com.damar.microservices.enrollment.api.EnrollmentApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnrollmentController implements EnrollmentApi {

    @Value("${server.port}")
    private String portNumber;

    @Override
    public ResponseEntity<String> signUp(String username) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("GET SignUp, Port Number: %s", portNumber));
    }
}
