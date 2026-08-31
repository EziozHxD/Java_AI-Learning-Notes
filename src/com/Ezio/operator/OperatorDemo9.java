package com.Ezio.operator;

import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class OperatorDemo9 {
    public static void main(String[] args) {

        // 练习：键盘输入一个三位数，判断能否被三整除
        //方法一
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();
        boolean isDivisibleBy3 = num % 3 == 0;
        System.out.println(isDivisibleBy3);

        //方法二
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num2 = sc2.nextInt();

        int ge = num2 % 10;
        int shi = num2 / 10 % 10;
        int bai = num2 / 100;
        int sum = ge + shi + bai;
        boolean isDivisibleBy = sum % 3 == 0;
        //boolean isDivisibleBy = ge + shi + bai % 3 == 0;
        //System.out.println(isDivisibleBy);
        System.out.println(isDivisibleBy);
    }
}