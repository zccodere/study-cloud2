package com.zccoder.cloud2.ch10.stream.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StreamConsumerApplication.class)
@WebAppConfiguration
//@DirtiesContext
public class HelloApplicationTests2 {

	@Autowired @Qualifier("input")
	private MessageChannel output;

	@Test
	public void contextLoads() {
		output.send(MessageBuilder.withPayload("From MessageChannel").build());
	}

}
