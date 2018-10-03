package com.zccoder.cloud2.ch7.gateway.exception.filter;

import com.netflix.zuul.FilterProcessor;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * <br>
 * 标题: 屏蔽异常<br>
 * 描述: 屏蔽异常<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
public class DidiFilterProcessor extends FilterProcessor {

    @Override
    public Object processZuulFilter(ZuulFilter filter) throws ZuulException {
        try {
            return super.processZuulFilter(filter);
        } catch (ZuulException e) {
            RequestContext ctx = RequestContext.getCurrentContext();
            ctx.set("failed.exception", e);
            ctx.set("failed.filter", filter);
            throw e;
        }
    }

}
