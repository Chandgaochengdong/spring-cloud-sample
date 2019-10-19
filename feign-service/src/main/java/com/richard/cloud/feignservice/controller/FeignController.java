package com.richard.cloud.feignservice.controller;

import com.richard.cloud.feignservice.feignclient.EurekaCleintApi;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/19 14:12
 **/
@RestController
public class FeignController {


    private EurekaCleintApi eurekaCleintApi;


    @Autowired
    public FeignController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.eurekaCleintApi = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                //.requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
                .target(EurekaCleintApi.class, "http://eureka-client");
    }


    @GetMapping("/testFeign")
    public String testFeign(String name){
        return eurekaCleintApi.feignHello(name);
    }
}
