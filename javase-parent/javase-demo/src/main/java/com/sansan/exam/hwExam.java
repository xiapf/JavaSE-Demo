package com.sansan.exam;

import java.util.Arrays;

/**
 * Created by xiapf on 2017/9/6.
 * 华为2017年校招笔试编程题：3
 */
public class hwExam {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {5,4,3,2,1};
        int[] arr = {3,4,1,2,5};
        int costTime = costTime(n, m, arr);
        System.out.println("耗时：" + costTime + "秒");
    }

    /**
     *
     * @param n 人数
     * @param m 龙头数
     * @param arr n个人的接酒量数组,同时也代表每个人接满酒需要的时间
     * @return
     */
    private static int costTime(int n, int m, int[] arr) {
        int time = 0;

        if (m >= n) {//龙头数 >= 人数
            Arrays.sort(arr);
            time = arr[arr.length-1];

        } else {//龙头数 < 人数
            //定义一个数组，长度为m，将前m个人的接酒量存进这个数组
            int[] timeArray = new int[m];
            for (int i = 0; i < m; i++) {
                timeArray[i] = arr[i];
            }

            for (int j = m; j < n; j++) {
                //将timeArray数组从小到大排序
                //缺点：排序次数太多，待优化
                Arrays.sort(timeArray);
                timeArray[0] = timeArray[0] + arr[j];
            }

            Arrays.sort(timeArray);
            time = timeArray[m-1];
        }

        return time;
    }
}
