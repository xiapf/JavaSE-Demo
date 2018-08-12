package com.sansan.multithread.chapter3.demo2;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * @Description: 写数据服务
 * @Package: com.sansan.multithread.chapter3.demo2
 * @Author: xiapf
 * @Date: 2018/8/12 22:03
 * @Version: 1.0
 */
public class WriteData {
    public void writeMethod(PipedOutputStream outputStream) {
        try {
            System.out.println("write begin:");
            for (int i = 0; i < 300; i++) {
                String outData = "" + (i + 1);
                outputStream.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println();
            outputStream.close();

            System.out.println("write over!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
