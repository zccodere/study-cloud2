package com.zccoder.cloud2.ch7.gateway.exception.filter.post;

import com.netflix.zuul.ZuulFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * <br>
 * 标题: 后置过滤器<br>
 * 描述: 后置过滤器<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@Component
public class ThrowExceptionPostFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(ThrowExceptionPostFilter.class);

    @Override
    public String filterType() {
        return "post";
    }

    @Override
    public int filterOrder() {
        return 10;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("This is a post filter, it will throw a RuntimeException");
        doSomething();
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }

}
