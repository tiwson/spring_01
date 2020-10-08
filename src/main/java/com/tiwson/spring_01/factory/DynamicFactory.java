package com.tiwson.spring_01.factory;

import com.tiwson.spring_01.service.UserService;
import com.tiwson.spring_01.service.UserServiceImpl;

public class DynamicFactory {
    public UserService createUs() {
        System.out.println("动态工厂创建bean方法");
        return new UserServiceImpl();
    }
}
