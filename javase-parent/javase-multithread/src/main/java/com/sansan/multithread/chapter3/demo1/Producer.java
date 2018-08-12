package com.sansan.multithread.chapter3.demo1;

/**
 * @Description: 生产者
 * @Package: com.sansan.multithread.chapter3.demo1
 * @Author: xiapf
 * @Date: 2018/8/6 21:31
 * @Version: 1.0
 */
public class Producer {
    private String lock;

    public Producer(String lock) {
        super();
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.value.equals("")) {
                    lock.wait();
                }

                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是" + value);
                ValueObject.value = value;
                lock.notify();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
