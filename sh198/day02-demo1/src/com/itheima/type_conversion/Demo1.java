package com.itheima.type_conversion;
/*
    自动类型转换
        类型范围小的变量，可以直接赋值给类型范围大的变量。
 */
public class Demo1 {
    public static void main(String[] args) {
        // 定义byte类型变量
        byte b = 100;
        // 定义int类型的变量, 接收的数据是byte类型的数据
        int number = b;
        System.out.println(number);


        // 自动类型转换
        int a = 10;
        double d = a;
        System.out.println(d); // 10.0
    }
}
