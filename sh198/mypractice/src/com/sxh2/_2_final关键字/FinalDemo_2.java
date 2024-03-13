package com.sxh2._2_final关键字;

/*
*常量
*   -static final修饰的成员变量称之为常量
*   -通常用于记录系统的配置信息，变量名全大写 BIANLIANG_NAME
*   -使用static使得变量可以用类名调用，同时使得其只占一份内存
*   -使用final使得变量不可以被修改！
*
*
*优点
*   -编译后，变量会被宏替换，即出现常量名的地方会被替换为其字面量，提高程序运行效率
*
**/

public class FinalDemo_2 {
    public static final String SCHOOL_NAME = "xx学校";

    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
    }
}
