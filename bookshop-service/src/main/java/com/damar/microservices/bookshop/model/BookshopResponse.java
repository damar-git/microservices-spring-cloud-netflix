package com.damar.microservices.bookshop.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookshopResponse {
    private String service;
    private Integer httpPort;
}
