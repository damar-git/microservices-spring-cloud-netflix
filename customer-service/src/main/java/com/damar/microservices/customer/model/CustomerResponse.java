package com.damar.microservices.customer.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CustomerResponse {
    private String service;
    private Integer httpPort;
}
