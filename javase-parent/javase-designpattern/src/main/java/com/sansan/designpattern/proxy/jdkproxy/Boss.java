package com.sansan.designpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理测试类
 */
public class Boss {

    public static void main(String[] args) {
        final Artist artist = new Lyf();

        Artist artistProxy = (Artist) Proxy.newProxyInstance(artist.getClass().getClassLoader(), artist.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //前续拦截操作
                System.out.println("经纪人拿了" + args[0] + "元，帮你联系艺人!");
                //真正的方法执行
                Object obj = method.invoke(artist, (Double) args[0] / 2);
                //后续处理
                System.out.println("完事了，美滋滋！");
                return obj;
            }
        });

        artistProxy.sing(400);
        artistProxy.dance(800);
        artistProxy.sleep(1000);
    }

}
