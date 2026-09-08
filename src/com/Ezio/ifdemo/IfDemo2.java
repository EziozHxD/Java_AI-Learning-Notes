package com.Ezio.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /*
        需求：
        初始最大生命200，受到X点伤害，技能恢复Y点血，X和Y由键盘录入而来。
        假设，游戏人物不会死亡，最少1点血。
        问：最终游戏人物血量是多少？
        */

        // 1.定义初始最大生命值
        int Hp = 200;

        // 2.键盘输入收到的伤害
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入受到的伤害：");
        int X = sc.nextInt();

        // 3.计算当前的剩余血量
        Hp = Hp - X;

        // 4.游戏人物血量强制不会低于1
        if (Hp <= 1){
            Hp = 1;
        }
        System.out.println("当前血量为：" + Hp);

        // 5.计算技能恢复的血量
        System.out.println("请输入技能恢复的血量：");
            int Y = sc.nextInt();
            Hp = Hp + Y;

        // 6.恢复的血量不会超过初始血量
        if (Hp >= 200){
            Hp = 200;
        }
        System.out.println("最终血量为：" + Hp);
    }
}
