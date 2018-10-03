package com.zccoder.cloud2.ch6.feign.consumer.service;

import com.zccoder.cloud2.ch6.feign.hello.api.service.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * <br>
 * 标题: 服务调用<br>
 * 描述: 服务调用<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService {

}
