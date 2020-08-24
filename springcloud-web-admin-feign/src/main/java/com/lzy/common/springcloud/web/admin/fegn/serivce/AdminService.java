package com.lzy.common.springcloud.web.admin.fegn.serivce;

import com.lzy.common.springcloud.web.admin.fegn.serivce.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "springcloud-client",fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hello",method= RequestMethod.GET)
    public String sayHello();

}
