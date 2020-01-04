package com.spring.ioc.application_context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @auther: ltc
 * @date: 2020/1/4 22:43
 * @description:
 */

public class ApplicationContext_ioc {

    public static void main(String[] args) {
        ApplicationContext xml = new ClassPathXmlApplicationContext("application.xml");
        ApplicationContext file = new FileSystemXmlApplicationContext("F:\\2020\\2020-spring\\src\\main\\resources\\application.xml");
        //Config类就是我们加了@Configuration的类了
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        System.out.println(xml);
        System.out.println(file);
        System.out.println(context);
    }
}
