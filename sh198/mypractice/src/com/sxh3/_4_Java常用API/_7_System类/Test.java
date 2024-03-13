package com.sxh3._4_Java常用API._7_System类;


/*
* -主要学习System类的两种方法
*   -exit()方法，终止jre
*   -currentTimeMillis()，获取毫秒数，1970.01.01 00:00 - 此时
* */

public class Test {
    public static void main(String[] args) {
        long milli = System.currentTimeMillis();
        System.out.println(milli);
        System.exit(0);
    }
}
