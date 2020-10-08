package com.tiwson.spring_01.factory;

import com.tiwson.spring_01.service.UserService;
import com.tiwson.spring_01.service.UserServiceImpl;

public class StaticFactory {
    public static UserService createUs() {
        System.out.println("静态工厂方法。。。。。");
        return new UserServiceImpl();
    }
}
