package com.sansan.multithread.chapter1;

/**
 * @Description:
 * @Package: com.sansan.multithread.chapter1.demo
 * @Author: xiapf
 * @Date: 2018/7/23 21:41
 * @Version: 1.0
 */
public class Test5 {
    public static void main(String[] args) {
        try {
            MyThread5 thread5 = new MyThread5();
            thread5.setDaemon(true);
            thread5.start();
            Thread.sleep(5000);
            System.out.println("我离开了，thread5对象也不再打印了，也就是停止了！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
