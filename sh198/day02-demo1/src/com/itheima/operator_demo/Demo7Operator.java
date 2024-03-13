package com.itheima.operator_demo;

/*
	逻辑运算符作用: 用于连接多个关系表达式
	注意 : 最终得到的结果都是boolean类型的true或false

	逻辑运算符分类 :
		&(与) : 并且, 遇false则false, 只有符号左右两边同时为true, 结果才为true.
		|(或) : 或者, 遇true则true, 只有符号左边两边同时为false, 结果才为false
		!(非) : 取反
		^(异或) : 相同为false, 不同为true.

		&& : 并且, 遇false则false  , 具备短路作用 , 当左边为false右边不执行
		|| : 或者, 遇true则true    , 具备短路作用 , 当左边为true右边不执行

		以后已使用比较多的 :  &&   ||    !
*/
public class Demo7Operator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;// 19
        int c = 30;

        // &&
        System.out.println(a > b && b > c); // false && false = false
        System.out.println(a < b && b > c); // true  && false = false
        System.out.println(a > b && b < c); // false && true  = false
        System.out.println(a < b && b < c); // true  && true  = true

        System.out.println("---------------------");

//        // &
//        System.out.println(a > b & --b > c); // false & false = false
//        System.out.println("b=" + b);// 19

        // && : 具备短路作用,当左边的结果为false右边不执行
        System.out.println(a > b && --b > c); // false && false = false
        System.out.println("b=" + b);// 20
    }
}