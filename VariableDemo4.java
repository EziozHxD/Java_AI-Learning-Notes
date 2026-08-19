package com.Ezio.variable;

public class VariableDemo4 {
    public static void main(String[] args) {

        // BMI身体质量指数计算公式：BMI =  体重(kg) / (身高(m) * 身高(m))

        // 定义一个变量记录我的体重，单位kg
        double weight = 76.5;

        // 定义一个变量记录我的身高，单位m
        double height = 1.85;

        // 计算BMI指数
        double bmi = weight / (height * height);
        System.out.println("BMI指数为：" + bmi);

        // 扩展：计算当前的身高在标准BMI下最多是多少千克？

        // 标准BMI范围为18.5-23.9(单位kg/m*m)
        double maxWeight = 23.9 * (height * height);

        // 计算体重在标准BMI下最多是多少千克
        System.out.println("标准BMI下最多体重为：" + maxWeight + "kg");
    }
}
