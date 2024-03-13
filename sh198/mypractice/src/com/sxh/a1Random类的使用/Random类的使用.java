package com.sxh.a1Random类的使用;

import java.util.Random;

/*
* 作用：产生随机数
* 用法：导包、创建对象、调用其成员方法
* */
public class Random类的使用 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num =  r.nextInt(10);
            System.out.println(num);
        }
    }
}
