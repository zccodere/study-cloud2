package com.zccoder.cloud2.ch7.gateway.exception.filter.error;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.stereotype.Component;

/**
 * <br>
 * 标题: 从POST抛出的异常，使用该过滤器返回错误信息<br>
 * 描述: 从POST抛出的异常，使用该过滤器返回错误信息<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@Component
public class ErrorExtFilter extends SendErrorFilter {

    Logger log = LoggerFactory.getLogger(ErrorExtFilter.class);

    @Override
    public String filterType() {
        return "error";
    }

    @Override
    public int filterOrder() {
        return 30;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        ZuulFilter failedFilter = (ZuulFilter) ctx.get("failed.filter");
        String post = "post";
        if (failedFilter != null && post.equals(failedFilter.filterType())) {
            return true;
        }
        return false;
    }

}
