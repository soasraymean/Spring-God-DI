package com.tyjohntompson.SpringGodDI.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello -- constructor way";
    }
}
