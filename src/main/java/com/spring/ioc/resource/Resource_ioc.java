package com.spring.ioc.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * @auther: ltc
 * @date: 2020/1/4 20:57
 * @description:
 */

public class Resource_ioc {

    public static void main(String[] args) throws IOException {
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] res = resolver.getResources("classpath:application.xml");
        for (Resource resource : res) {
            System.out.println(resource.getDescription() + "----" + resource.getFilename());
        }
        //
        Resource[] res2 = resolver.getResources("file:/Users/zdy/Desktop/sql.txt");
        for (Resource resource : res2) {
            System.out.println(resource.getDescription() + "----" + resource.getFilename());
        }
    }
}
