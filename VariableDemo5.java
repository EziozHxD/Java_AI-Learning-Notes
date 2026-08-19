package com.Ezio.variable;

import java.util.Scanner;    //确定Scanner类的位置

public class VariableDemo5 {
    public static void main(String[] args) {

        // 1.创建Scanner类对象
        Scanner sc = new Scanner(System.in);

        // 2.用Scanner类对象接收用户输入的数据
        // 接收用户输入的整数数据
        int num = sc.nextInt();
        System.out.println(num);

        //接收用户输入的浮点数数据
        double num2 = sc.nextDouble();
        System.out.println(num2);

        //接收用户输入的文本(字符串)数据
        String str = sc.next();
        System.out.println(str);
    }
}
