package com.sansan.multithread.chapter3.demo1;

/**
 * @Description: 一生产者与一消费者：操作值
 * @Package: com.sansan.multithread.chapter3.demo1
 * @Author: xiapf
 * @Date: 2018/8/6 21:47
 * @Version: 1.0
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ProducerThread producerThread = new ProducerThread(producer);
        ConsumerThread consumerThread = new ConsumerThread(consumer);
        producerThread.start();
        consumerThread.start();
    }
}
