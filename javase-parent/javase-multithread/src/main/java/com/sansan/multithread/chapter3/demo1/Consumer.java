package com.sansan.multithread.chapter3.demo1;

/**
 * @Description: 消费者
 * @Package: com.sansan.multithread.chapter3.demo1
 * @Author: xiapf
 * @Date: 2018/8/6 21:40
 * @Version: 1.0
 */
public class Consumer {
    private String lock;

    public Consumer(String lock) {
        super();
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }

                System.out.println("get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
