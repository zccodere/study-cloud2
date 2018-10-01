package com.zccoder.cloud2.ch2.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * 标题: Rest API<br>
 * 描述: Rest API<br>
 * 时间: 2018/10/01<br>
 *
 * @author zc
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}