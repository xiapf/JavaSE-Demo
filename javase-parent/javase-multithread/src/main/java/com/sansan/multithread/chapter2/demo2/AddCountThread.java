package com.sansan.multithread.chapter2.demo2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 测试原子类AtomicInteger
 * @Package: com.sansan.multithread.chapter2.demo2
 * @Author: xiapf
 * @Date: 2018/7/31 21:31
 * @Version: 1.0
 */
public class AddCountThread extends Thread {
    private AtomicInteger count = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(count.incrementAndGet());
        }
    }
}
