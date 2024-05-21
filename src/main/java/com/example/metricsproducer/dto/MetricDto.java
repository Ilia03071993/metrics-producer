package com.example.metricsproducer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MetricDto {
    private String type;
    private String message;
}