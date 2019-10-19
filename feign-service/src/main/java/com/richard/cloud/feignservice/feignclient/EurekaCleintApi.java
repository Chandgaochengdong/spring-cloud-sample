package com.richard.cloud.feignservice.feignclient;

import com.richard.cloud.feignservice.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/19 14:13
 **/
//@FeignClient(name = "eureka-client",configuration = FeignConfig.class)
public interface EurekaCleintApi {


    @GetMapping("/feignhello")
    String feignHello(@RequestParam("name")String name);

}
