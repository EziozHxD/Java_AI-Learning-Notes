package com.Ezio.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {

        // BMI身体质量指数计算公式：BMI =  体重(kg) / (身高(m) * 身高(m))

        // 1.创建Scanner类对象
        Scanner sc = new Scanner(System.in);

        // 2.用Scanner类对象接收用户输入的体重
        System.out.println("请输入体重(kg)：");
        double weight = sc.nextDouble();
        System.out.println("您输入的体重是：" + weight + "kg");

        // 3.用Scanner类对象接收用户输入的身高
        System.out.println("请输入身高(m)：");
        double height = sc.nextDouble();
        System.out.println("您输入的身高是：" + height + "m");

        // 4.计算用户BMI指数
        double bmi = weight / (height * height);
        System.out.println("您的BMI指数是：" + bmi);
    }
}
