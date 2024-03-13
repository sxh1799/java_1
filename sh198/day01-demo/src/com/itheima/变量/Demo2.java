package com.itheima.变量;

/*
    1 变量要先声明才能使用

    2 变量是什么类型，就应该用来装什么类型的数据，否则报错。

    3 变量是从定义开始到“}”截止的范围内有效；且同一个范围内，定义的多个变量，它们的名称不能一样。

    4 变量定义的时候可以不赋初始值；但在使用时，变量里必须有值，否则报错。
 */
public class Demo2 {
    public static void main(String[] args) {
        // 变量的格式 : 数据类型  变量名 = 数据值;

        // 1 变量要先声明才能使用
        // int age = 18;
        // System.out.println(age);

        // 4 变量定义的时候可以不赋初始值；但在使用时，变量里必须有值，否则报错。
        int age; // 声明一个变量
        age = 18;// 给变量赋值
        System.out.println(age);

        // 2 变量是什么类型，就应该用来装什么类型的数据，否则报错。
        // int number = 100.1; // 报错 , 不能把一个小数赋值给一个整数变量

        // 3 变量是从定义开始到“}”截止的范围内有效；且同一个范围内，定义的多个变量，它们的名称不能一样。
        // 解释 : 变量的作用域(使用范围) : 在它所在的大括号内有效

        // 代码块
        {
            int price = 10;
            System.out.println(price);
            System.out.println(age);
        }
        // System.out.println(price); // 报错
        System.out.println(age);
    }
}
