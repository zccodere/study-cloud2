package com.zccoder.cloud2.ch10.stream.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.support.GenericMessage;

/**
 * <br>
 * 标题: 分区消息<br>
 * 描述: 分区消息<br>
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
@EnableBinding(value = {Source.class})
public class SinkSender4 {

    private static Logger logger = LoggerFactory.getLogger(StreamProducerApplication.class);

    @Bean
    @InboundChannelAdapter(value = Source.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}");
    }

//    配置属性
//    # Partition
//    spring.cloud.stream.bindings.output.destination=greetings
//    spring.cloud.stream.bindings.output.producer.partitionKeyExpression=payload
//    spring.cloud.stream.bindings.output.producer.partitionCount=2
}




