package com.sps.tracing.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {

    private final RestTemplate restTemplate;

    public CustomerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/customer")
    public String getCustomer() throws Exception{
        Thread.sleep(200);
        this.restTemplate.getForEntity("http://localhost:8082/order", String.class).getBody();
        return "Hello from customer service...";
    }
}
