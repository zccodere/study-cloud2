package com.zccoder.cloud2.ch3.eureka.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 服务注册<br>
 * 时间: 2018/10/01<br>
 *
 * @author zc
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHelloApplication.class, args);
    }

}
