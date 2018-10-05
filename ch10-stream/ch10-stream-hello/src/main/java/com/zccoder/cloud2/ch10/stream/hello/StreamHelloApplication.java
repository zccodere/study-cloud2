package com.zccoder.cloud2.ch10.stream.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.integration.annotation.ServiceActivator;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
@SpringBootApplication
@EnableBinding(Sink.class)
public class StreamHelloApplication {

    private static Logger logger = LoggerFactory.getLogger(StreamHelloApplication.class);

    @ServiceActivator(inputChannel = Sink.INPUT)
    public void loggerSink(Object payload) {
        logger.info("Received: " + payload);
    }
}