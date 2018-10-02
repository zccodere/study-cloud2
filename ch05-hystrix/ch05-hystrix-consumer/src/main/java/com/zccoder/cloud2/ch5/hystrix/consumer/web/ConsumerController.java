package com.zccoder.cloud2.ch5.hystrix.consumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 标题: REST<br>
 * 描述: REST<br>
 * 时间: 2018/10/02<br>
 *
 * @author zc
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }

}