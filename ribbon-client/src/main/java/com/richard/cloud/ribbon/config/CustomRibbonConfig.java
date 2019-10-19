package com.richard.cloud.ribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.richard.cloud.ribbon.annotation.Exclude;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author Richard
 * @Date 2019/10/17 19:34
 **/
@Configuration
@Exclude
public class CustomRibbonConfig {

    @Bean
    public IRule ribbonRule() {
        // 自定义为随机规则

        return new RandomRule();
    }

    /*@Bean
    public IPing ribbonPing() {
        return new PingUrl();
    }*/
}
