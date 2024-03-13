package com.sxh3._4_Java常用API._3_包装类;

/*
* -包装类
*   -就是把8个基本数据类型的数据包装成对象
*   -byte  short   int       long    float   double  char        boolean
*   -Byte  Short   Integer   Long    Float   Double  Character   Boolean
*
*
* -注意事项
*   -1、自动装箱
*       -就是把基本数据类型的数据自动转换成包装类
*       -如 Integer i = 10;
*   -2、自动拆箱
*       -自动装箱的反过程
*       -如 int a = i;
*
* -包装类的作用
*   -把基本数据类型的数据转为字符串
*       -通过包装类中的静态方法 toString()
*
*   -把字符串转为对应的数值本身
*       -通过包装类中的静态方法 parseXxx()，如 parseInt()
*
*
* */
public class Test {
    public static void main(String[] args) {
        m2();
        m3();

    }

    // 字符串--->>基本数据类型
    private static void m3() {
        String s = "1234";
        int i = Integer.parseInt(s);
        System.out.println(i);

        int j = Integer.valueOf(s); // 涉及到自动装箱，因为valueOf的返回值是一个Integer对象
    }

    // 基本数据类型---->>字符串
    private static void m2() {
        int num1 = 100;
        String string = Integer.toString(num1);
        System.out.println(string);
    }

    // 自动拆装箱
    private static void method() {
        Integer i = 10; // 底层调用 integer i = new Integer(10)来实现
        System.out.println(i);

        int a = i;  // 底层调用 int a = Integer.valueOf(10) 来实现
        System.out.println(a);
    }
}
