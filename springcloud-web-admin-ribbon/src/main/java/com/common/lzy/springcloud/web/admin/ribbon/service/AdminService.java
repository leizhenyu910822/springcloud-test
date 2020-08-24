package com.common.lzy.springcloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHello() {
        return restTemplate.getForObject("http://springcloud-client/hello", String.class);
    }

    public String hiError() {
        return String.format("Hi your message is : but request bad");
    }

}
