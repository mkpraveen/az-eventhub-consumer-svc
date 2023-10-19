package com.praveenmk.az.events.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.praveenmk.az.events.services.EventSenderService;

@RestController
public class EventPublisherController {
    
    @Autowired
    private EventSenderService eventSenderService;

    @GetMapping("/publish")
    private String publishEvents() {

        eventSenderService.publishEvents();
        
        return "SUCCESS";
    }
}
