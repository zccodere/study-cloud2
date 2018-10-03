package com.zccoder.cloud2.ch7.gateway.exception.filter.pre;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * <br>
 * 标题: 前置过滤器<br>
 * 描述: 前置过滤器<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@Component
public class ThrowExceptionFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(ThrowExceptionFilter.class);

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        log.info("This is a pre filter, it will throw a RuntimeException");
        RequestContext ctx = RequestContext.getCurrentContext();
        try {
            doSomething();
        } catch (Exception e) {
            ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            // 可以设置自定义错误消息：error.message，有一些错误发生);
            ctx.set("error.exception", e);
        }
        return null;
    }

    private void doSomething() {
        throw new RuntimeException("Exist some errors...");
    }

}
