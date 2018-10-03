package com.zccoder.cloud2.ch6.feign.hello.service.web;

import com.zccoder.cloud2.ch6.feign.hello.api.dto.User;
import com.zccoder.cloud2.ch6.feign.hello.api.service.HelloService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 标题: 用户服务实现<br>
 * 描述: 用户服务实现<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@RestController
public class RefactorHelloControllerImpl implements HelloService {

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age) {
        return new User(name, age);
    }

    @Override
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + "," + user.getAge();
    }
}
