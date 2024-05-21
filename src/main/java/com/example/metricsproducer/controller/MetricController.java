package com.example.metricsproducer.controller;

import com.example.metricsproducer.dto.MetricDto;
import com.example.metricsproducer.service.MetricService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/metrics")
public class MetricController {
    private final MetricService metricService;

    @PostMapping
    public void sendMetric(@RequestBody MetricDto metricDto) {
        metricService.sendMetric(metricDto);
    }
}