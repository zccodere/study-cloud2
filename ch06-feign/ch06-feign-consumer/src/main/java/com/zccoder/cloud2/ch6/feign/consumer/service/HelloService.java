package com.zccoder.cloud2.ch6.feign.consumer.service;

import com.zccoder.cloud2.ch6.feign.hello.api.dto.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * <br>
 * 标题: 服务<br>
 * 描述: 服务<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@FeignClient(value = "hello-service", fallback = HelloServiceFallbackImpl.class)
public interface HelloService {

    /**
     * Say Hello
     *
     * @return Hello String
     */
    @RequestMapping("/hello")
    String hello();

    /**
     * hello
     *
     * @param name name
     * @return hello name
     */
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    /**
     * hello
     *
     * @param name name
     * @param age  age
     * @return hello name age
     */
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    /**
     * hello
     *
     * @param user user
     * @return hello user
     */
    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    String hello(@RequestBody User user);
}
