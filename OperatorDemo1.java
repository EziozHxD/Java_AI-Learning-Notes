package com.Ezio.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {

        /*整数运算符：+- * / %
          整数运算、小数运算*/

        // 1.整数运算
        // 整数相除，结果为整数，小数部分舍弃
        int a = 10;
        int b = 3;
        System.out.println(a + b);    //13
        System.out.println(a - b);    //7
        System.out.println(a * b);    //30
        System.out.println(a / b);    //3
        System.out.println(a % b);    //1

        System.out.println("---------------");

        // 2.小数运算
        // 小数直接运算，结果可能不精确
        double c = 10.0;
        double d = 3.0;
        System.out.println(c + d);    //13.0
        System.out.println(c - d);    //7.0
        System.out.println(c * d);    //30.0
        System.out.println(c / d);    //3.3333333333333335
        System.out.println(c % d);    //1.0
    }
}
