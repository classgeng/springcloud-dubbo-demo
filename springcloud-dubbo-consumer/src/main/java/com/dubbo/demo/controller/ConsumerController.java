package com.dubbo.demo.controller;

import com.dubbo.demo.api.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xfgeng
 * @date 2020-11-16 15:16
 */
@Slf4j
@RestController
@RequestMapping("/api")
public class ConsumerController {

    @Reference(check=false)
    ProviderService providerService;

    @GetMapping("/sayHello")
    public String sayHello(String name){
        log.info("ConsumerController name:{}",name);
        return providerService.sayHello(name);
    }

}
