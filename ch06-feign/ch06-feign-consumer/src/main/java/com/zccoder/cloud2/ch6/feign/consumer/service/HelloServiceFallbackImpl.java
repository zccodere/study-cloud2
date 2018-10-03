package com.zccoder.cloud2.ch6.feign.consumer.service;

import com.zccoder.cloud2.ch6.feign.hello.api.dto.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <br>
 * 标题: 服务降级回调实现<br>
 * 描述: 服务降级回调实现<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@Component
public class HelloServiceFallbackImpl implements HelloService {

    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User("未知", 0);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "error";
    }

}
