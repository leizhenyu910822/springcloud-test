package com.common.lzy.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello(){
        return String.format("Hello %sport%s","",port);
    }
}
