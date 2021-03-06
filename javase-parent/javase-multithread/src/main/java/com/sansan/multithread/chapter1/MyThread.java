package com.sansan.multithread.chapter1;

/**
 * Created by xiapf on 2017/6/1.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态了！我要退出了！");
                    throw new InterruptedException();

                }
                System.out.println("i=" + (i + 1));
            }
        } catch (InterruptedException e) {
            System.out.println("进MyThread,java类run方法中的catch了！");
            e.printStackTrace();
        }

    }
}
