package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther: ltc
 * @date: 2020/1/4 20:09
 * @description:
 */

public class IocController {

    //ioc->bean获取
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        IocBean iocBean = (IocBean) applicationContext.getBean("iocBean");
        System.out.println(iocBean);
    }
}
