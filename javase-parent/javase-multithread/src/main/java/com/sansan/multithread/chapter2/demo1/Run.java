package com.sansan.multithread.chapter2.demo1;

/**
 * @Description: 测试类
 * @Package: com.sansan.multithread.chapter2.demo1
 * @Author: xiapf
 * @Date: 2018/7/26 21:53
 * @Version: 1.0
 */
public class Run {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.setName("线程A");
        thread1.start();
        MyThread2 thread2 = new MyThread2(task);
        thread2.setName("线程B");
        thread2.start();
    }
}
