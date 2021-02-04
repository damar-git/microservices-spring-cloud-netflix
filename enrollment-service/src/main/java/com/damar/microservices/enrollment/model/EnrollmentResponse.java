package com.damar.microservices.enrollment.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EnrollmentResponse {
    private String service;
    private Integer httpPort;
}
