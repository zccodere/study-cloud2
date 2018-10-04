package com.zccoder.cloud2.ch9.bus.rabbitmq.hello.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * <br>
 * 标题: 消息发送者<br>
 * 描述: 消息发送者<br>
 * 时间: 2018/10/04<br>
 *
 * @author zc
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello " + new Date();
        System.out.println("Sender : " + context);
        this.rabbitTemplate.convertAndSend("hello", context);
    }

}