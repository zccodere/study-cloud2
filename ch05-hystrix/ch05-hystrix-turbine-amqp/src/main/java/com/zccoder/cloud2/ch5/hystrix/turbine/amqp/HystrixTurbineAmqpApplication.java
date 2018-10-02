package com.zccoder.cloud2.ch5.hystrix.turbine.amqp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;
import org.springframework.context.annotation.Configuration;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * 时间: 2018/10/02<br>
 *
 * @author zc
 */
@Configuration
@EnableAutoConfiguration
@EnableTurbineStream
@EnableDiscoveryClient
public class HystrixTurbineAmqpApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixTurbineAmqpApplication.class, args);
    }

}
