package com.sansan.multithread.chapter3.demo1;

/**
 * @Description: 消费者线程
 * @Package: com.sansan.multithread.chapter3.demo1
 * @Author: xiapf
 * @Date: 2018/8/6 21:45
 * @Version: 1.0
 */
public class ConsumerThread extends Thread {
    private Consumer consumer;

    public ConsumerThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true) {
            consumer.getValue();
        }
    }
}
