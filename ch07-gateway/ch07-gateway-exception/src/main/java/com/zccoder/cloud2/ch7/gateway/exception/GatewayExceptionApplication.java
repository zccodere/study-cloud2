package com.zccoder.cloud2.ch7.gateway.exception;

import com.zccoder.cloud2.ch7.gateway.exception.filter.DidiErrorAttributes;
import com.zccoder.cloud2.ch7.gateway.exception.filter.DidiFilterProcessor;
import com.netflix.zuul.FilterProcessor;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
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
public class GatewayExceptionApplication {

    public static void main(String[] args) {
        FilterProcessor.setProcessor(new DidiFilterProcessor());
        new SpringApplicationBuilder(GatewayExceptionApplication.class).web(true).run(args);
    }

    @Bean
    public DefaultErrorAttributes errorAttributes() {
        return new DidiErrorAttributes();
    }

}
