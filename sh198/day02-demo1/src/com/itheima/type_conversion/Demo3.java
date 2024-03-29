package com.itheima.type_conversion;
/*
    类型范围大的数据或者变量，直接赋值给类型范围小的变量，会报错。
    解决方案 : 使用强制类型转换

    强行将类型范围大的变量、数据赋值给类型范围小的变量。
    格式 :  目标类型 变量名 = (目标类型)(被转换的数据)
    注意事项
        1 强制类型转换可能造成数据(丢失)溢出；
        2 浮点型强转成整型，直接丢掉小数部分，保留整数部分返回

    1500二进制
        00000000 00000000 00000101 11011100
    强转为byte类型

    了解
    数据在计算机中做运算 , 底层使用的都是补码形式
    源码 : 00000000 00000000 00000101 11011100
    反码 : 00000000 00000000 00000101 11011100
    补码 : 00000000 00000000 00000101 11011100

    补码 : 00000000 00000000 00000101 11011100
    强转为byte类型
    补码结果 : 11011100  - 1
    反码    : 11011011
    源码    : 10100100   --> -36

 */
public class Demo3 {
    public static void main(String[] args) {
        // 类型范围大的数据或者变量，直接赋值给类型范围小的变量，会报错。
        // int a = 10;
        // byte b = a;

        /*
            解决方案 : 使用强制类型转换
            格式 :  目标类型 变量名 = (目标类型)(被转换的数据)
            注意事项 :
                1 被转换的数据只有一个,那么被转换的数据小括号可以省略
         */
        int a = 10;
        byte b = (byte)a;

        byte b1 = 10;
        byte b2 = 20;
        byte result = (byte) (b1 + b2);

        System.out.println("-----------------------");

        System.out.println((byte)1500);// 127

        System.out.println("-----------------------");

        System.out.println((int)12.12);// 12
    }
}
