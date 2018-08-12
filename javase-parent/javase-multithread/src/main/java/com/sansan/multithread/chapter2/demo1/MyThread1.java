package com.sansan.multithread.chapter2.demo1;

/**
 * @Description:
 * @Package: com.sansan.multithread.chapter2.demo1
 * @Author: xiapf
 * @Date: 2018/7/26 21:51
 * @Version: 1.0
 */
public class MyThread1 extends Thread {
    private Task task;

    public MyThread1(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
