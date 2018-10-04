package com.zccoder.cloud2.ch9.bus.rabbitmq.hello.rabbit;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <br>
 * 标题: 队列配置<br>
 * 描述: 队列配置<br>
 * 时间: 2018/10/04<br>
 *
 * @author zc
 */
@Configuration
public class RabbitConfig {

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }

}
