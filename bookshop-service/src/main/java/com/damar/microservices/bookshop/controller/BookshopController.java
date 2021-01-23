package com.damar.microservices.bookshop.controller;

import com.damar.microservices.bookshop.api.BookshopApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookshopController implements BookshopApi {

    @Value("${server.port}")
    private String portNumber;

    @Override
    public ResponseEntity<String> getBookById(Long bookId) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(String.format("GET Book, Port Number: %s", portNumber));
    }
}