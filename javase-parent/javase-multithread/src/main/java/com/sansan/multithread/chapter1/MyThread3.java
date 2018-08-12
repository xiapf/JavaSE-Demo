package com.sansan.multithread.chapter1;

/**
 * Created by xiapf on 2017/9/4.
 */
public class MyThread3 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("哈哈哈");
                this.stop();
                System.out.println("这边的代码还能执行吗？");
            }
        } catch (ThreadDeath e) {
            System.out.println("调用stop()方法抛出了java.lang.ThreadDeath一场，进入了catch块");
            e.printStackTrace();
        }
    }
}
