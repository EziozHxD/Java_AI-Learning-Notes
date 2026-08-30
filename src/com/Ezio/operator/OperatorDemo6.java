package com.Ezio.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {

        // 实现字母的大小写转换

        // 1.定义变量记录大写字符
        char ch = 'A';

        // 2.转换为小写字符
        char ch2 = (char)(ch + 32);
        System.out.println(ch2);

    }
}