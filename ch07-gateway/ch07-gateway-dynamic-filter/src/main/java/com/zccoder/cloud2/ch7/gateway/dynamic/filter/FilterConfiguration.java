package com.zccoder.cloud2.ch7.gateway.dynamic.filter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <br>
 * 标题: 配置<br>
 * 描述: 配置<br>
 * 时间: 2018/10/03<br>
 *
 * @author zc
 */
@ConfigurationProperties("zuul.filter")
public class FilterConfiguration {

    private String root;
    private Integer interval;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }
}
