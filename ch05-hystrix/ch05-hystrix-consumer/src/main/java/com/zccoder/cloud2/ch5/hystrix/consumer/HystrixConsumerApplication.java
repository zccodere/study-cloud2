package com.zccoder.cloud2.ch5.hystrix.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * // @SpringCloudApplication 等价于 @SpringBootApplication 和 @EnableDiscoveryClient 和 @EnableCircuitBreaker
 * <p>
 * 时间: 2018/10/01<br>
 *
 * @author zc
 */
@EnableHystrix
@SpringCloudApplication
public class HystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
