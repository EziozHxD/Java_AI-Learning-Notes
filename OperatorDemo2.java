package com.Ezio.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {

        //键盘输入一个三位数，将其拆分为个位、十位、百位后，分别输出

        // 1.键盘输入一个三位数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        // ALT + P  强制AI快速生成代码
        int num = sc.nextInt();
        System.out.println("输入的三位数是：" + num);

        // 2.将三位数拆分为个位、十位、百位
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}