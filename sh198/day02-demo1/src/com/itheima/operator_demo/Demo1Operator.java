package com.itheima.operator_demo;

/*
   运算符: 连接[常量]或[变量]的符号

   算数运算符
       + - * : 跟小学数学的运算方式一样

       / : 整数相除,结果只能得到整数,如果想要得到带有小数的结果,必须加入小数(浮点类型)的运算
       % : 取余数
*/
public class Demo1Operator {
    public static void main(String[] args) {
        System.out.println(6 + 4); // 10
        System.out.println(6 - 4); // 2
        System.out.println(6 * 4); // 24
        System.out.println(6 / 4); // 1
        System.out.println(6 / 4.0); // 1.5
        System.out.println(6.0 / 4); // 1.5
        System.out.println(6 % 4); // 2
        System.out.println(3 % 4); // 3
    }
}