package com.richard.cloud.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/8 16:40
 **/

@RestController
public class EurekaClientController {


    @GetMapping("/eurekaClient")
    public String eurekaClient(){
        return "hello,I am eureka Client";
    }

}
