package com.zccoder.cloud2.ch3.eureka.hello.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 标题: Rest API<br>
 * 描述: Rest API<br>
 * 时间: 2018/10/01<br>
 *
 * @author zc
 */
@RestController
public class HelloController {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        logger.info("/hello, host: " + instance.getHost() + ", service_id: " + instance.getServiceId());
        return "Hello World";
    }
}