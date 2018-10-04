package com.zccoder.cloud2.ch9.bus.config.client.eureka.kafka.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 标题: 测试 REST<br>
 * 描述: 测试 REST<br>
 * 时间: 2018/10/04<br>
 *
 * @author zc
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

}