package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther: ltc
 * @date: 2020/1/4 10:22
 * @description:
 */
@RestController
public class AutowiredController {

    //容器中有多个bean对象类型和被@Autowired修饰的变量类型匹配，则根据被@Autowired修饰的变量名寻找，找到则注入成功
    @Autowired
    private AService AServiceImpl1;

    //@Qualifier常常组合@Autowired一起使用，用来指明具体名字的自动装配
    @Autowired
    @Qualifier("AServiceImpl2")
    private AService aService;

    //    @Resource(name = "AAServiceImpl")
    @Resource(type = AAServiceImpl.class)
    private AService aAServiceImpl;


    @GetMapping("test")
    public String test() {

        return "SUCCESS";
    }

}
