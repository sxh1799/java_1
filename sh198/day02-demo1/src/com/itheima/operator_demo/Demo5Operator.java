package com.itheima.operator_demo;

/*
    关系运算符(比较运算符) :
        (>)	(>=) (<) (<=) (==) (!=)

    注意事项：
        1 用关系运算符连接起来的式子叫做关系表达式 , 关系表达式的结果是一个boolean类型的值。!!!
        2 千万不要把“==”误写成“=”。
*/
public class Demo5Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        // >
        System.out.println(a > b);// false
        System.out.println(b > c);// true

        System.out.println("-------------");

        // >= : 大于行等于也可以
        System.out.println(a >= b); // false
        System.out.println(b >= c); // true
        System.out.println(a >= c); // true


        System.out.println("-------------");

        // ==
        System.out.println(a == b);// false
        System.out.println(a == c);// true


        System.out.println("-------------");

        // !=
        System.out.println(a != b);// true
        System.out.println(a != c);// false

        System.out.println("-------------");

        System.out.println(a = 20);  // 20
        System.out.println(a == 20); // true
    }
}