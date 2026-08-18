package com.Ezio.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*小科维奇没有子弹
        老科维奇有30发子弹
        他们一共有几发子弹？
        小科维奇换了弹夹，获得30发子弹，又打出了10发子弹，现在有几发子弹？*/

        // 1.定义变量记录小科维奇的子弹数量
        int NiKo = 0;

        // 2.定义变量记录老科维奇的子弹数量
        int huNter = 30;

        // 3.计算并输出小科维奇和老科维奇一共有几发子弹
        System.out.println("小科维奇和老科维奇一共有" + (NiKo + huNter) + "发子弹");

        // 4.小科维奇换了弹夹，获得30发子弹(原来的子弹数量加上新的子弹数量是现有的子弹数量，令变量记录现有的子弹数量)
        NiKo = NiKo + 30;

        // 5.小科维奇打了10发子弹(现有的子弹数量减去打出来的子弹数量是剩下的子弹数量，令变量记录剩下的子弹数量)
        NiKo = NiKo - 10;

        // 6.输出小科维奇现在有几发子弹
        System.out.println("小科维奇现在有" + NiKo + "发子弹");
    }
}
