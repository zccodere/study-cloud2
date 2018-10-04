package com.zccoder.cloud2.ch9.bus.rabbitmq.hello;

import com.zccoder.cloud2.ch9.bus.rabbitmq.hello.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <br>
 * 标题: 测试类<br>
 * 描述: 测试类<br>
 * 时间: 2018/10/04<br>
 *
 * @author zc
 */
@RunWith(SpringJUnit4ClassRunner.class)
@Import(BusRabbitmqHelloApplication.class)
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @Test
    public void hello() throws Exception {
        sender.send();
    }

}
