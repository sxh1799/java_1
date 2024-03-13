package com.sxh3._4_Java常用API._6_Math数学工具类;

/*
* -是工具类
*   -构造方法私有
*   -成员方法均为静态方法，通过类名直接调用
* */
public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1.1));     // 绝对值
        System.out.println(Math.ceil(1.1));     // 向上取整
        System.out.println(Math.floor(1.1));     // 向下取整
        System.out.println(Math.round(1.1));    //四舍五入
        System.out.println(Math.max(1,2));      // 获取最大值
        System.out.println(Math.pow(2,3));      // 2的3次方
        System.out.println(Math.random());      // 返回[0.0, 1.0)的小数值
    }
}
