package com.damar.microservices.bookshop.controller;

import com.damar.microservices.bookshop.api.BookshopApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BookshopController implements BookshopApi {

    @Value("${server.port}")
    private String serverPortNumber;


    @Override
    public ResponseEntity<String> getHttpPort() {
        log.info("HTTP Server Port: {}", serverPortNumber);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("[Bookshop-API] HTTP Server Port: %s", serverPortNumber));
    }
}
