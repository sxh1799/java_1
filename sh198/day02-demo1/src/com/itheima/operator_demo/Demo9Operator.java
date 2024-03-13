package com.itheima.operator_demo;

/*
   三元运算符:
       格式 :  关系表达式 ? 表达式1 : 表达式2;
       执行流程 :
               首先计算关系表达式的值
               如果值为true，取表达式1的值
               如果值为false，取表达式2的值

    需求: 求两个变量的最大值
    需求: 求三个变量的最大值
 */
public class Demo9Operator {
    public static void main(String[] args) {
//        // 需求: 求两个变量的最大值
//        int a = 30;
//        int b = 20;
//
//        int max = a > b ? a : b;
//        System.out.println("max = " + max);


        // 需求: 求三个变量的最大值
        int a = 20;
        int b = 30;
        int c = 10;

        // 求出ab中的最大值 , temp记录的是ab中的最大值
        int temp = a > b ? a : b;
        // 用temp和c比较,求出三个数据的最大值
        int max = temp > c ? temp : c;
        System.out.println("三个数据的最大值为:" + max);

//        int max1 = a > b ? (a > c ? a : c) : (b > c ? b : c);
//        System.out.println(max1);

        System.out.println( (1 + 2) * 3);
    }
}