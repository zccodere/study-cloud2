package com.zccoder.cloud2.ch10.stream.consumer;

import java.io.Serializable;


/**
 * <br>
 * 标题: 用户实体<br>
 * 描述: 用户实体<br>
 * 时间: 2018/10/05<br>
 *
 * @author zc
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7792049730164807825L;
    private String name;
    private Integer age;

    public User() {

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
