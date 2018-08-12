package com.sansan.multithread.chapter1;

/**
 * @Description:
 * @Package: com.sansan.multithread.chapter1.demo
 * @Author: xiapf
 * @Date: 2018/7/23 21:04
 * @Version: 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("main thread begin priority=" + mainThread.getPriority());
        mainThread.setPriority(6);
        System.out.println("main thread end priority=" + mainThread.getPriority());
        MyThread4 thread4 = new MyThread4();
        thread4.start();
    }
}
