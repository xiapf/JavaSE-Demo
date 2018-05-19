package com.sansan.designpattern.proxy.jdkproxy;

public class Lyf implements Artist {
    @Override
    public void sing(double money) {
        System.out.println("刘亦菲拿了" + money + "元，陪你唱歌！");
    }

    @Override
    public void dance(double money) {
        System.out.println("刘亦菲拿了" + money + "元，陪你跳舞！");
    }

    @Override
    public void sleep(double money) {
        System.out.println("刘亦菲拿了" + money + "元，陪你睡觉！");
    }
}
