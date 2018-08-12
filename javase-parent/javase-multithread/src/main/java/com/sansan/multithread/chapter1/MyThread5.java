package com.sansan.multithread.chapter1;

/**
 * @Description: 守护线程
 * @Package: com.sansan.multithread.chapter1.demo
 * @Author: xiapf
 * @Date: 2018/7/23 21:38
 * @Version: 1.0
 */
public class MyThread5 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
