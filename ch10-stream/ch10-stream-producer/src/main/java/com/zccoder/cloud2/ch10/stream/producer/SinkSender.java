package com.zccoder.cloud2.ch10.stream.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.GenericMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <br>
 * 标题: 快速入门<br>
 * 描述: 快速入门<br>
 * //@EnableBinding(value = {SinkSender.SinkOutput.class})
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
public class SinkSender {

    private static Logger logger = LoggerFactory.getLogger(StreamProducerApplication.class);

    @Bean
    @InboundChannelAdapter(value = SinkOutput.OUTPUT, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Date> timerMessageSource() {
        return () -> new GenericMessage<>(new Date());
    }

    @Transformer(inputChannel = Sink.INPUT, outputChannel = SinkOutput.OUTPUT)
    public Object transform(Date message) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(message);
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




