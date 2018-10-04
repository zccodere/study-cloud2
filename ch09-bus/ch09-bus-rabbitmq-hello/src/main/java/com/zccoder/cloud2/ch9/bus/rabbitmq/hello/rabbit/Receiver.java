package com.zccoder.cloud2.ch9.bus.rabbitmq.hello.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * <br>
 * 标题: 消息接收者<br>
 * 描述: 消息接收者<br>
 * 时间: 2018/10/04<br>
 *
 * @author zc
 */
@Component
@RabbitListener(queues = "hello")
public class Receiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver : " + hello);
    }

}
