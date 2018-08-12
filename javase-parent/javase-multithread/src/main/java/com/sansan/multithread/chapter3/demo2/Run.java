package com.sansan.multithread.chapter3.demo2;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * @Description:
 * @Package: com.sansan.multithread.chapter3.demo2
 * @Author: xiapf
 * @Date: 2018/8/12 22:16
 * @Version: 1.0
 */
public class Run {
    public static void main(String[] args) {
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream();

            //inputStream.connect(outputStream);
            outputStream.connect(inputStream);

            //写线程和读线程的启动顺序可调换，看效果
            WriteThread writeThread = new WriteThread(writeData, outputStream);
            writeThread.start();

            Thread.sleep(2000);

            ReadThread readThread = new ReadThread(readData, inputStream);
            readThread.start();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
