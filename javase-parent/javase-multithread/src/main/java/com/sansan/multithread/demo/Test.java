package com.sansan.multithread.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiapf on 2017/6/1.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Thread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            System.out.println("准备打停止标记");
            thread.interrupt();
            System.out.println("停止标记已打");
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }

        System.out.println("end");

    }

    public static String getNumber(String str) {
        //正则表达式过滤
        String regEx="[^0-9]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        String retValue = m.replaceAll("").trim();
        return retValue;
    }
}
