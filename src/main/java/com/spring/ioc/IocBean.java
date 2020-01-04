package com.spring.ioc;

import java.io.Serializable;

/**
 * @auther: ltc
 * @date: 2020/1/4 20:05
 * @description:
 */
public class IocBean implements Serializable {

    private String name;

    private int age;

    public IocBean(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IocBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
