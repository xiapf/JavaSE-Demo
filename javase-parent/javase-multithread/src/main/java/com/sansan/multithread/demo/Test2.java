package com.sansan.multithread.demo;

/**
 * Created by xiapf on 2017/9/4.
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            MyThread2 thread = new MyThread2();
            thread.start();
            Thread.sleep(4000);
            thread.stop();
            System.out.println("调用stop()方法后还能执行");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
