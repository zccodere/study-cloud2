package com.zccoder.cloud2.ch10.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * <br>
 * 标题: 分区试验接收者<br>
 * 描述: 分区试验接收者<br>
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
@EnableBinding(value = {Sink.class})
public class SinkReceiver4 {

    private static Logger logger = LoggerFactory.getLogger(StreamConsumerApplication.class);


    @StreamListener(Sink.INPUT)
    public void receive(User user) {
        logger.info("Received: " + user);
    }

//    配置属性如下：
//    # Comsumer Group:input
//    spring.cloud.stream.bindings.input.group=Service-A
//
//    # Partition
//    spring.cloud.stream.bindings.input.destination=greetings
//    spring.cloud.stream.bindings.input.consumer.partitioned=true
//    spring.cloud.stream.instanceCount=2
//    spring.cloud.stream.instanceIndex=0

}
