package com.Ezio.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
        /*我方使用英雄a         对方使用英雄b
        攻击力：120           攻击力：350
        防御力：200           防御力：60
        技能倍率：1.5         技能倍率：2.5
        血量：2000.5            血量：1100.5

        普通攻击伤害公式：攻击力 - 对方防御力
        技能伤害公式：攻击力 * 技能倍率 - 对方防御力

        计算：
        1.请问我方第一次选择释放普通攻击可以造成多少伤害，对方还剩多少血量
        2.请问我方第二次选择释放技能可以造成多少伤害，对方还剩多少血量*/

        // 1.定义变量记录我方英雄a的攻击力
        int Aattack = 120;

        // 2.定义变量记录我方英雄a的防御力
        int Adefense = 200;

        // 3.定义变量记录我方英雄a的技能倍率
        double Askill = 1.5;

        // 4.定义变量记录我方英雄a的血量
        double Ahp = 2000.5;

        // 5.定义变量记录对方英雄b的攻击力
        int Battack = 350;

        // 6.定义变量记录对方英雄b的防御力
        int Bdefense = 60;

        // 7.定义变量记录对方英雄b的技能倍率
        double BsKill = 2.5;

        // 8.定义变量记录对方英雄b的血量
        double Bhp = 1100.5;

        // 1.请问我方第一次选择释放普通攻击可以造成多少伤害，对方还剩多少血量
        //普通攻击伤害公式：攻击力 - 对方防御力
        int AattackDamage = Aattack - Bdefense;
        System.out.println("我方第一次选择释放普通攻击可以造成" + AattackDamage + "伤害");
        Bhp = Bhp - AattackDamage;
        System.out.println("对方还剩" + Bhp + "血量");

        // 2.请问我方第二次选择释放技能可以造成多少伤害，对方还剩多少血量
        // 技能伤害公式：攻击力 * 技能倍率 - 对方防御力
        double AskillDamage = Aattack * Askill - Bdefense;
        System.out.println("我方第二次选择释放技能可以造成" + AskillDamage + "伤害");
        Bhp = Bhp - AskillDamage;
        System.out.println("对方还剩" + Bhp + "血量");
    }
}
