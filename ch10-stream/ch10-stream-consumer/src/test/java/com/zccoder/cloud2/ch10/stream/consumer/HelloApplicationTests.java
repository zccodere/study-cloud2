package com.zccoder.cloud2.ch10.stream.consumer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = StreamConsumerApplication.class)
@WebAppConfiguration
//@DirtiesContext
public class HelloApplicationTests {

	@Autowired
	private SinkSender sinkSender;

	@Test
	public void contextLoads() {
		sinkSender.output().send(MessageBuilder.withPayload("From SinkSender").build());
	}

	public interface SinkSender {

		String OUTPUT = "input";

		@Output(SinkSender.OUTPUT)
		MessageChannel output();

	}

}
