package com.sps.tracing.ordering.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderingController {

    private final RestTemplate restTemplate;

    public OrderingController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/order")
    public String getOrderDetails() throws Exception{
        Thread.sleep(200);
        return this.restTemplate.getForEntity("http://localhost:8083/inventory", String.class).getBody();
    }

}
