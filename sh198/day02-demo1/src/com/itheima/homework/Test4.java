package com.itheima.homework;

public class Test4 {
    public static void main(String[] args) {
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a); // 20
        }

        // 片段2
        {
            int b = 20;
            System.out.println(b);// 20
        }
        int b = 30;// 报错
        System.out.println(b);// 30
    }
}
