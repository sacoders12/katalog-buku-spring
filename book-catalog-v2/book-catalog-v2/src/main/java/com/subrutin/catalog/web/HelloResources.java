package com.subrutin.catalog.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subrutin.catalog.service.GreetingService;

@RestController
public class HelloResources {

    Logger log = LoggerFactory.getLogger(HelloResources.class);

    private GreetingService greetingService;

    public HelloResources(GreetingService greetingService) {
        super();
        this.greetingService = greetingService;
    }

    //Hello path
    @GetMapping("/hello")
    public String helloWorld()
    {
        log.info("This is log info");
        return greetingService.sayGreeting();
    }
}
