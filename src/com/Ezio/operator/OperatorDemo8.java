package com.Ezio.operator;

import java.util.Scanner;

public class OperatorDemo8 {
    public static void main(String[] args) {

        // 练习：键盘输入我和朋友的身高，比一比谁更高
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入我的身高：");
        double myHeight = sc.nextDouble();
        System.out.println("请输入朋友的身高：");
        double friendHeight = sc.nextDouble();
        // 比较
        boolean isTaller = myHeight >= friendHeight;
        System.out.println(isTaller);
    }
}
