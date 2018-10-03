package com.zccoder.cloud2.ch7.gateway.dynamic.route;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.context.annotation.Bean;

/**
 * <br>
 * 标题: 启动类<br>
 * 描述: 启动类<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@EnableZuulProxy
@SpringCloudApplication
public class GatewayDynamicRouteApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayDynamicRouteApplication.class).web(true).run(args);
    }

    @Bean
    @RefreshScope
    @ConfigurationProperties("zuul")
    public ZuulProperties zuulProperties() {
        return new ZuulProperties();
    }

}
