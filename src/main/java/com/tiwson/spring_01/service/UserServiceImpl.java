package com.tiwson.spring_01.service;

public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("Constructor init!");
    }

    public void hello() {
        System.out.println("Hello IOC !");
    }

    public void init() {
        System.out.println("init....");
    }
    public void destroy() {
        System.out.println("destroy....");
    }
}
