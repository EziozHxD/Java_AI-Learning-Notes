package com.Ezio.operator;

import java.util.Scanner;

public class OperatorDemo11 {
    public static void main(String[] args) {

        // &&：短路与
        // ||：短路或
        // ！：逻辑非

        //1.输入一个四位整数，判断这个整数是否是回文数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数：");
        int num = sc.nextInt();
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        int qian = num / 1000;

        //判断这个整数是否是回文数
        boolean isPalindrome = ge == qian && shi == bai;
        System.out.println(isPalindrome);

        //2.输入一个两位整数，判断这个整数是否是7的有缘数
        // 只要该数字包含7或者是7的倍数，那么就是7的有缘数
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个两位整数：");
        int num2 = sc2.nextInt();
        int ge2 = num2 % 10;
        int shi2 = num2 / 10;
        boolean isLuckyNumber = num2 % 7 == 0 || ge2 == 7 || shi2 == 7;
        System.out.println(isLuckyNumber);
    }
}
