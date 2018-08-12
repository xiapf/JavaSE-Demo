package com.sansan.multithread.chapter3.demo2;

import java.io.PipedInputStream;

/**
 * @Description: 读数据线程
 * @Package: com.sansan.multithread.chapter3.demo2
 * @Author: xiapf
 * @Date: 2018/8/12 22:15
 * @Version: 1.0
 */
public class ReadThread extends Thread {
    private ReadData readData;
    private PipedInputStream inputStream;

    public ReadThread(ReadData readData, PipedInputStream inputStream) {
        super();
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
