package com.sansan.multithread.demo;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class test33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        List<HashSet> data = new ArrayList<HashSet>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            HashSet<Integer> set = new HashSet<Integer>();
            for (int j = 0; j < num; j++) {
                set.add(sc.nextInt());
            }
            data.add(set);
        }

        System.out.println(getResult(data, n, c));

    }

    private static int getResult(List<HashSet> data, int n, int c) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            data.add(data.get(i));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= c; j++) {
                for (Object h : data.get(i + j)) {
                    if (data.get(i).contains(h)) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }


}