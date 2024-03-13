package com.itheima.operator_test;

/*
    需求：定义一个三位数，将其拆分为个位、十位、百位后，打印在控制台

    运行结果:
        整数123个位为:3
        整数123十位为:2
        整数123百位为:1

        123%10=3            456%10=6            74567%10=7
        123/10%10=2         456/10%10=5         74567/10%10=6
        123/10/10%10=1      456/10/10%10=4      74567/10/10%10=5
*/
public class OperatorTest1 {
    public static void main(String[] args) {
        // 1 定义一个三位数
        int number = 789;

        // 2 获取三位数的个位 十位 百位
        int ge  = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 10 / 10 % 10;

        System.out.println("整数" + number + "个位为:" + ge);
        System.out.println("整数" + number + "十位为:" + shi);
        System.out.println("整数" + number + "百位为:" + bai);
    }
}






