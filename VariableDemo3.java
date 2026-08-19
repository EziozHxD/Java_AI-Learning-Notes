package com.Ezio.variable;

public class VariableDemo3 {
    public static void main(String[] args) {
        /*定义8种数据类型的变量：
          整数类型：byte short int long
          浮点数类型：float double
          字符类型：char
          布尔类型：Boolean*/

        // 1.定义一个byte类型的变量
        byte b = 127;
        System.out.println(b);  //在内存中占1个字节

        // 2.定义一个short类型的变量
        short s = 32767;
        System.out.println(s);  //在内存中占2个字节

        // 3.定义一个int类型的变量
        int i = 2147483647;
        System.out.println(i);  //在内存中占4个字节

        // 4.定义一个long类型的变量
        // long类型结尾必须加L或l
        long l = 9223372036854775807L;
        System.out.println(l);  //在内存中占8个字节

        // 5.定义一个float类型的变量
        // float类型结尾必须加F或f
        float f = 3.14f;
        System.out.println(f);  //在内存中占4个字节

        // 6.定义一个double类型的变量
        double d = 2.71828;
        System.out.println(d);  //在内存中占8个字节

        // 7.定义一个char类型的变量
        char c = '中';
        System.out.println(c);  //在内存中占2个字节

        // 8.定义一个boolean类型的变量
        boolean bool = true;
        System.out.println(bool);  //在内存中占1个字节
    }
}