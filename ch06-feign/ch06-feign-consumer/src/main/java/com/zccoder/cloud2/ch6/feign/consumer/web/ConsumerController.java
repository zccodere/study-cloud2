package com.zccoder.cloud2.ch6.feign.consumer.web;

import com.zccoder.cloud2.ch6.feign.consumer.service.HelloService;
import com.zccoder.cloud2.ch6.feign.consumer.service.RefactorHelloService;
import com.zccoder.cloud2.ch6.feign.hello.api.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 标题: REST<br>
 * 描述: REST<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private RefactorHelloService refactorHelloService;

    @GetMapping("/feign-consumer")
    public String hello() {
        return helloService.hello();
    }

    @GetMapping("/feign-consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("DIDI")).append("\n");
        sb.append(helloService.hello("DIDI", 30)).append("\n");
        sb.append(helloService.hello(new User("DIDI", 30))).append("\n");
        return sb.toString();
    }

    @GetMapping("/feign-consumer3")
    public String hello3() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(refactorHelloService.hello("MIMI")).append("\n");
        sb.append(refactorHelloService.hello("MIMI", 20)).append("\n");
        sb.append(refactorHelloService.hello(new User("MIMI", 20))).append("\n");
        return sb.toString();
    }

}
