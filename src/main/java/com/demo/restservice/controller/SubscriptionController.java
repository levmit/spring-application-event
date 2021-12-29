package com.demo.restservice.controller;

import com.demo.restservice.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SubscriptionController {

    @Autowired
    SubscriptionService subscriptionService;

    @PutMapping("/subscription/{id}")
    public void update(@PathVariable(value = "id") String id) {
        subscriptionService.updateSubscription(id);
    }

    @PostMapping("/subscription")
    public void create(@RequestParam String id) {
        subscriptionService.createSubscription(id);
    }
}
