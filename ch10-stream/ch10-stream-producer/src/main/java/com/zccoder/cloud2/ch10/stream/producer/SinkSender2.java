package com.zccoder.cloud2.ch10.stream.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

/**
 * <br>
 * 标题: 快速入门<br>
 * 描述: 快速入门<br>
 * //@EnableBinding(value = {SinkSender2.SinkOutput.class})
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
public class SinkSender2 {

    private static Logger logger = LoggerFactory.getLogger(StreamProducerApplication.class);

    @Bean
    @InboundChannelAdapter(value = Sink.INPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<String> timerMessageSource() {
        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}");
    }

    public interface SinkOutput {

        String OUTPUT = "input";

        /**
         * 输出
         *
         * @return 消息通道
         */
        @Output(SinkOutput.OUTPUT)
        MessageChannel output();

    }
}




