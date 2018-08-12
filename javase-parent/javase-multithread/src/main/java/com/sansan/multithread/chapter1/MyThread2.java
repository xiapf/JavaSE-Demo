package com.sansan.multithread.chapter1;

/**
 * Created by xiapf on 2017/9/4.
 */
public class MyThread2 extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
