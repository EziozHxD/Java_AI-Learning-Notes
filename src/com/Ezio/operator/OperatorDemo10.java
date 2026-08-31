package com.Ezio.operator;

import java.util.Scanner;

public class OperatorDemo10 {
    public static void main(String[] args) {

        // &：逻辑与
        // |：逻辑或
        // ！：逻辑非

        //练习1：输入一个整数，判断这个整数是否在1-10之间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        boolean isBetween = num >= 1 & num <= 10;
        System.out.println(isBetween);

        //练习2：输入一个整数，判断这个整数是否不在1-10之间
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num2 = sc2.nextInt();
        boolean isNotBetween = num2 < 1 | num2 > 10;
        System.out.println(isNotBetween);
    }
}
