package com.lzy.common.springcloud.web.admin.fegn.serivce.hystrix;

import com.lzy.common.springcloud.web.admin.fegn.serivce.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHello() {
        return String.format("Hi your message is : but request bad");
    }
}
