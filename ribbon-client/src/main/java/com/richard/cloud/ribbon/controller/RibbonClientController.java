package com.richard.cloud.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/17 18:07
 **/
@RestController
public class RibbonClientController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getEurekaServer")
    public String getEurekaServer(String name){
       return this.restTemplate.getForObject("http://eureka-client/ribbon?name=" + name, String.class);
    }

}
