package com.sansan.multithread.chapter3.demo2;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Description: 读数据服务
 * @Package: com.sansan.multithread.chapter3.demo2
 * @Author: xiapf
 * @Date: 2018/8/12 22:07
 * @Version: 1.0
 */
public class ReadData {
    public void readMethod(PipedInputStream inputStream) {
        try {
            System.out.println("read begin:");
            for (int i = 0; i < 300; i++) {
                byte[] bytes = new byte[20];
                int readLength = 0;
                while ((readLength = inputStream.read(bytes)) != -1) {
                    String newData = new String(bytes, 0, readLength);
                    System.out.print(newData);
                }
            }
            System.out.println();
            System.out.println("read over!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
