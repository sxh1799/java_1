package com.itheima.字面量;
/*
    字面量(常量)
        1 整数常量 : 没有小数点
        2 小数常量 : 有小数点
        3 字符常量 : 单引号引起来 , 引号中有且只有一个字符
        4 字符串常量 : 双引号引起来 , 没有要求
        5 布尔常量 : true 真  , false 假
        6 空值 : null  ---> 在后面数组部分讲解!!!
 */
public class Demo {
    public static void main(String[] args) {
        // 整数常量
        System.out.println(123);
        System.out.println(-888);

        System.out.println("---------------");

        // 小数常量
        System.out.println(3.14);

        System.out.println("---------------");

        // 字符常量
        System.out.println('a');
        System.out.println('8');
        System.out.println(' ');
        System.out.println('好');

        System.out.println("---------------");

        // 字符串常量
        System.out.println("HelloWorld");
        System.out.println("12345");
        System.out.println("哈哈哈");
        System.out.println("abc\nqwe"); // \n换行的意思
        System.out.println("\tabc");    // \t 缩进,键盘的tab键距离

        System.out.println("---------------");

        // 布尔常量
        System.out.println(true);
        System.out.println(false);


        // 空常量 , 特殊null不能直接打印
        // System.out.println(null);
    }
}
