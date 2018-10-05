package com.zccoder.cloud2.ch10.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.annotation.rxjava.RxJavaProcessor;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.SendTo;

/**
 * <br>
 * 标题: 消息反馈<br>
 * 描述: 消息反馈<br>
 * 时间: 2018/10/05<br>
 * //@EnableRxJavaProcessor
 * //@EnableBinding(value = {Processor.class})
 *
 * @author zc
 */
public class App1 {

    private static Logger logger = LoggerFactory.getLogger(StreamConsumerApplication.class);

    /**
     * 处理消息
     * 或使用 // @ServiceActivator(inputChannel= Processor.INPUT, outputChannel = Processor.OUTPUT)
     *
     * @param payload payload
     * @return object
     */
    @StreamListener(Processor.INPUT)
    @SendTo(Processor.OUTPUT)
    public Object receiveFromInput(Object payload) {
        logger.info("Received: " + payload);
        return "From Input Channel Return - " + payload;
    }

    /**
     * rxjava实现
     *
     * @return RxJavaProcessor
     */
    @Bean
    public RxJavaProcessor<String, String> processor() {
        return inputStream -> inputStream.map(data -> {
            logger.info("Received: " + data);
            return data;
        }).buffer(5).map(data -> String.valueOf("From Input Channel Return - " + data));
    }

}
