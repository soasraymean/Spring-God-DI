package com.tyjohntompson.SpringGodDI.controller;

import com.tyjohntompson.SpringGodDI.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    private final GreetingService greetingService;

    public MainController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHi(){
        return greetingService.sayGreeting();
    }

}
