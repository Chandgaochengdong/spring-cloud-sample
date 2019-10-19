package com.richard.cloud.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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



    @Value("${server.port}")
    private String port2;


    @GetMapping("/ribbon")
    public String ribbon(String name){

        return  port2 + "  ribbon say hello " + name;
    }

    @GetMapping("/feignhello")
    public String feignHello(@RequestParam("name")String name){
        return port2 + " feignHello eureka client says : hello " + name;
    }



}
