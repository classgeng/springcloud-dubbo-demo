package com.dubbo.demo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/sayHello")
    public String sayHello(String name){
        return name + ",hello!";
    }

}
