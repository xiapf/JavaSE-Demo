package com.sansan.designpattern.proxy.cglibproxy;

/**
 * Created by xiapf on 2018/3/26.
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        UserService proxyInstance = (UserService) proxy.getProxyInstance();
        proxyInstance.addUser();
    }
}
