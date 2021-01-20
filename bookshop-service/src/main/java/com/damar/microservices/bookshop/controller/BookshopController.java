package com.damar.microservices.bookshop.controller;

import com.damar.microservices.bookshop.api.BookshopApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookshopController implements BookshopApi {

    @Override
    public ResponseEntity<Void> getBookById() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
