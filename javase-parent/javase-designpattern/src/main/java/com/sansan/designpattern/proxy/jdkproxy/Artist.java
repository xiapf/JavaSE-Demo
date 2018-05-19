package com.sansan.designpattern.proxy.jdkproxy;

/**
 * 被代理的对象需要实现一个接口
 */
public interface Artist {
    public void sing(double money);

    public void dance(double money);

    public void sleep(double money);
}
