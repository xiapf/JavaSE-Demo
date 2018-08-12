package com.sansan.multithread.chapter2.demo1;

/**
 * @Description: 2.2.4 一半异步，一半同步
 * @Package: com.sansan.multithread.chapter2.demo1
 * @Author: xiapf
 * @Date: 2018/7/26 21:47
 * @Version: 1.0
 */
public class Task {
    public void doLongTimeTask() {
        for (int i = 0; i < 100; i++) {
            System.out.println("异步执行 threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
        }
        System.out.println("==============================");
        synchronized (this) {
            for (int i = 0; i < 100; i++) {
                System.out.println("同步执行 threadName=" + Thread.currentThread().getName() + " i=" + (i + 1));
            }
        }
    }
}
