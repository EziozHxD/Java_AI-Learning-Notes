package com.Ezio.operator;

public class OperatorDemo12 {
    public static void main(String[] args) {

        //1.利用三元运算符求两个数中的最大值
        //格式：条件 ? 表达式1 : 表达式2
        int a = 30;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
        System.out.println(a > b ? a : b);
    }
}