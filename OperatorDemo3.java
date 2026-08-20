package com.Ezio.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) {

        // 1.定义变量记录用户输入的秒数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds = sc.nextInt();
        System.out.println("输入的秒数是：" + seconds);

        // 2.获取小时数
        int hours = seconds / 3600;
        System.out.println("小时数是：" + hours);

        // 3.获取分钟数
        int minutes = seconds % 3600 / 60;
        System.out.println("分钟数是：" + minutes);

        // 4.获取秒数
        int Second = seconds % 3600 % 60;
        System.out.println("秒数是：" + Second);
    }
}
