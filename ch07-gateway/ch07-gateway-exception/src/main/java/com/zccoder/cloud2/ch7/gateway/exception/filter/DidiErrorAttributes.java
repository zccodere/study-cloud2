package com.zccoder.cloud2.ch7.gateway.exception.filter;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * <br>
 * 标题: 屏蔽异常<br>
 * 描述: 屏蔽异常<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
public class DidiErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(
            RequestAttributes requestAttributes, boolean includeStackTrace) {
        Map<String, Object> result = super.getErrorAttributes(requestAttributes, includeStackTrace);
        result.remove("exception");
        return result;
    }

}
