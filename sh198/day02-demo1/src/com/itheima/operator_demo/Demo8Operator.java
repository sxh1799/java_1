package com.itheima.operator_demo;

/*
   三元运算符:
       格式 :  关系表达式 ? 表达式1 : 表达式2;
       执行流程 :
               首先计算关系表达式的值
               如果值为true，取表达式1的值
               如果值为false，取表达式2的值

   需求: 求两个变量的最大值
 */
public class Demo8Operator {
    public static void main(String[] args) {
        // 需求 : 判断一个学生的成绩是否及格
        // 1 定义学生的分数
        int score = 30;
        // 格式 :  关系表达式 ? 表达式1 : 表达式2;
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println("result = " + result);
    }
}