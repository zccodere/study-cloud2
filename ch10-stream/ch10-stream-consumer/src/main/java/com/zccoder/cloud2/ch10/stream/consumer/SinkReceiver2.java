package com.zccoder.cloud2.ch10.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * <br>
 * 标题: 快速入门接收消息<br>
 * 描述: 快速入门接收消息<br>
 * 时间: 2018/10/05<br>
 * //@EnableBinding(value = {Sink.class})
 *
 * @author zc
 */
public class SinkReceiver2 {

    private static Logger logger = LoggerFactory.getLogger(StreamConsumerApplication.class);


    @StreamListener(Sink.INPUT)
    public void receive(User user) {
        logger.info("Received: " + user);
    }

    /**原生实现需要实现转换**/

//    @ServiceActivator(inputChannel=Sink.INPUT)
//    public void receive(User user) {
//        logger.info("Received: " + user);
//    }
//
//    @Transformer(inputChannel = Sink.INPUT, outputChannel = Sink.INPUT)
//    public User transform(String message) throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        User user = objectMapper.readValue(message, User.class);
//        return user;
//    }

}
