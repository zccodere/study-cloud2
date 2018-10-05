package com.zccoder.cloud2.ch10.stream.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

import java.util.Date;

/**
 * <br>
 * 标题: 消息反馈<br>
 * 描述: 消息反馈<br>
 * 时间: 2018/10/05<br>
 * //@EnableBinding(value = {Processor.class})
 *
 * @author zc
 */
public class App2 {

    private static Logger logger = LoggerFactory.getLogger(StreamProducerApplication.class);

    @Bean
    @InboundChannelAdapter(value = Processor.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessageSource() {
        return () -> new GenericMessage<>(new Date());
    }

    @StreamListener(Processor.INPUT)
    public void receiveFromOutput(Object payload) {
        logger.info("Received: " + payload);
    }

}
