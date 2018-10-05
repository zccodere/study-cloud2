package com.zccoder.cloud2.ch10.stream.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * <br>
 * 标题: 接收消息<br>
 * 描述: 接收消息<br>
 * 时间: 2018/10/05<br>
 * //@EnableBinding(value = {Sink.class})
 *
 * @author zc
 */
public class SinkReceiver3 {

    private static Logger logger = LoggerFactory.getLogger(StreamConsumerApplication.class);

    @StreamListener(Sink.INPUT)
    public void receive(User user) {
        logger.info("Received: " + user);
    }

//    @Bean
//    @InboundChannelAdapter(value = Sink.INPUT, poller = @Poller(fixedDelay = "2000"))
//    public MessageSource<String> timerMessageSource() {
//        Map<String, Object> headers = new HashMap<>();
//        headers.put("content-type", "application/user");
//        return () -> new GenericMessage<>("{\"name\":\"didi\", \"age\":30}", headers);
//    }

    // Need @Transformer
//    @ServiceActivator(inputChannel=Sink.INPUT)
//    public void receive(User user) {
//        logger.info("Received: " + user);
//    }

//    @Transformer(inputChannel = Sink.INPUT, outputChannel = Sink.INPUT)
//    public User transform(String message) throws Exception {
//        ObjectMapper objectMapper = new ObjectMapper();
//        User user = objectMapper.readValue(message, User.class);
//        return user;
//    }

}
