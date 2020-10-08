package com.tiwson.spring_01.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void test01() {
        UserService us = new UserServiceImpl();
        us.hello();
    }

    @Test
    public void test02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService us = (UserServiceImpl)ac.getBean("us");
        us.hello();
    }

    @Test
    public void test03() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\java\\spring_01\\applicationContext.xml");
        UserService us = (UserServiceImpl)ac.getBean("us");
        us.hello();
    }

    @Test
    public void test04() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("===========================");
        UserService us = (UserServiceImpl)ac.getBean("us");
        us.hello();
    }
}
