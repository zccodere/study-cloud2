package com.zccoder.cloud2.ch10.stream.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

/**
 * <br>
 * 标题: 发送消息<br>
 * 描述: 发送消息<br>
 * 时间: 2018/10/05<br>
 * //@EnableBinding(value = {Processor.class})
 *
 * @author zc
 */
public class SinkSender3 {

    private static Logger logger = LoggerFactory.getLogger(StreamProducerApplication.class);

    @Bean
    @InboundChannelAdapter(value = Processor.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}");
    }

}
