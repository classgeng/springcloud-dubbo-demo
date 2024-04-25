package com.dubbo.demo.provider.service;

import com.dubbo.demo.api.ProviderService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Slf4j
@Service
public class ProviderServiceImpl implements ProviderService {

    @Override
    public String sayHello(String name) {
        log.info("ProviderServiceImpl name:{}",name);
        return name + ",hello!";
    }

}
