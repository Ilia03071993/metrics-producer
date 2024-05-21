package com.example.metricsproducer.service;

import com.example.metricsproducer.dto.MetricDto;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MetricService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMetric(MetricDto metricDto) {
        kafkaTemplate.send("metrics-topic", metricDto);
    }
}