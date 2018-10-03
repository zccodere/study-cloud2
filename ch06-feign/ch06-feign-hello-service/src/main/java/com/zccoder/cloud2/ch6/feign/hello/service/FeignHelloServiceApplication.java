package com.zccoder.cloud2.ch6.feign.hello.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class FeignHelloServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHelloServiceApplication.class, args);
    }

}
