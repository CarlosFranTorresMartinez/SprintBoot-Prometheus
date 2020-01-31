package com.carlos.micrometer.micrometersprintboot15;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    MeterRegistry meterRegistry;

    @GetMapping
    public String prueba() {
        meterRegistry.counter("Metrica")
                .increment();
        return "MetricaHola";
    }
}
