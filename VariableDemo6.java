package com.Ezio.variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {

        /*定义两个整数类型的变量num1和num2，键盘录入数据分别为两个变量赋值。
          求两个数的和并进行打印。*/

        // 1.创建Scanner类对象
        Scanner sc = new Scanner(System.in);

        // 1.用Scanner类接收第一个整数
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();

        // 2.用Scanner类接收第二个整数
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("两个数的和为：" + sum);
    }
}