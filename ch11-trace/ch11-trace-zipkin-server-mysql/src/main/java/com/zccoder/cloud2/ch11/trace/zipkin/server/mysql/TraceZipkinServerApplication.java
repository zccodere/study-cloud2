package com.zccoder.cloud2.ch11.trace.zipkin.server.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
@EnableZipkinStreamServer
@SpringBootApplication
public class TraceZipkinServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TraceZipkinServerApplication.class, args);
    }

}
