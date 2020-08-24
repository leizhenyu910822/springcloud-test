package com.common.lzy.springcloud.web.admin.ribbon.controller;

import com.common.lzy.springcloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "sayHello", method = RequestMethod.GET)
    public String sayHello() {
        return adminService.sayHello();
    }

}
