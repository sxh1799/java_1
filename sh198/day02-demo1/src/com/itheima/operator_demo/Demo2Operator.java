package com.itheima.operator_demo;

/*
      字符参与运算 : 拿到字符在ASCII表中对应的数据值 , 在进行做运算
      ‘a’---  97	‘b’--- 98 ...
      ‘A’---  65 	‘B’--- 66 ...
      ‘0’---  48	‘1’--- 49 ...
      注意 : 可以参与任何运算

      字符串参与加法运算 : 字符串参与加法操作 , 加法符号起到的拼接或者链接作用 , 拼接之后是一个新的字符串 。
      注意 : 只能参与加法运算
*/
public class Demo2Operator {
    public static void main(String[] args) {
        // 字符串参与加法运算 : 字符串参与加法操作 , 加法符号起到的拼接或者链接作用 , 拼接之后是一个新的字符串 。
        System.out.println("100" + 10 + 10);// "1001010"
        System.out.println(10 + "110");// 10110
        System.out.println(10 + 10 + "110");// "20110"

        System.out.println("---------------------");

        // 字符参与运算 : 拿到字符在ASCII表中对应的数据值 , 在进行做运算
        System.out.println('a' + 1);// 98
        System.out.println('B' - 1);// 65
        System.out.println('c' % 7);// 14...1
    }
}