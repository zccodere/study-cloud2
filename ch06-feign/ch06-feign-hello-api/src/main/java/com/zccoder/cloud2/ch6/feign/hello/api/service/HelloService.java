package com.zccoder.cloud2.ch6.feign.hello.api.service;

import com.zccoder.cloud2.ch6.feign.hello.api.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * <br>
 * 标题: 用户服务<br>
 * 描述: 用户服务<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@RequestMapping("/refactor")
public interface HelloService {

    /**
     * hello
     *
     * @param name name
     * @return hello name
     */
    @RequestMapping(value = "/hello4", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    /**
     * hello
     *
     * @param name name
     * @param age  age
     * @return hello name age
     */
    @RequestMapping(value = "/hello5", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    /**
     * hello
     *
     * @param user user
     * @return hello user
     */
    @RequestMapping(value = "/hello6", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}