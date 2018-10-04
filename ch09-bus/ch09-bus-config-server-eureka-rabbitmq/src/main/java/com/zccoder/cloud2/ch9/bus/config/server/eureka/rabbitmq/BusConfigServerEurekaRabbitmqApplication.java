package com.zccoder.cloud2.ch9.bus.config.server.eureka.rabbitmq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * 时间: 2018/10/04<br>
 *
 * @author zc
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class BusConfigServerEurekaRabbitmqApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BusConfigServerEurekaRabbitmqApplication.class).web(true).run(args);
    }

}
