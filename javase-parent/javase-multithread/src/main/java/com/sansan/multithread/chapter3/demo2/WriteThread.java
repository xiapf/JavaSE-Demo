package com.sansan.multithread.chapter3.demo2;

import java.io.PipedOutputStream;

/**
 * @Description: 写数据线程
 * @Package: com.sansan.multithread.chapter3.demo2
 * @Author: xiapf
 * @Date: 2018/8/12 22:11
 * @Version: 1.0
 */
public class WriteThread extends Thread {
    private WriteData writeData;
    private PipedOutputStream outputStream;

    public WriteThread(WriteData writeData, PipedOutputStream outputStream) {
        super();
        this.writeData = writeData;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        writeData.writeMethod(outputStream);
    }
}
