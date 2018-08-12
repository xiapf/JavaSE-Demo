package com.sansan.multithread.chapter1;

/**
 * @Description:
 * @Package: com.sansan.multithread.chapter1.demo
 * @Author: xiapf
 * @Date: 2018/7/23 21:03
 * @Version: 1.0
 */
public class MyThread4 extends Thread {
    @Override
    public void run() {
        //线程创建的时候，初始化priority取得是父线程的priority值
        System.out.println("MyThread4 run priority" + this.getPriority());
    }
}
