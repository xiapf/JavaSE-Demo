package com.sansan.multithread.chapter3.demo1;

/**
 * @Description: 生产者线程
 * @Package: com.sansan.multithread.chapter3.demo1
 * @Author: xiapf
 * @Date: 2018/8/6 21:44
 * @Version: 1.0
 */
public class ProducerThread extends Thread {
    private Producer producer;

    public ProducerThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.setValue();
        }
    }
}
