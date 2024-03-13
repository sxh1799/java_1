package com.sxh4._2_方法引用._1_静态方法引用;

import java.util.function.IntBinaryOperator;

/*
* -方法引用
*   -可以进一步简化Lambda表达式
*
*   -静态方法引用
*        -格式     类名::方法名
*
*    -实例方法引用
*        -格式     对象名::方法名
*        -需要先创建对象
*
* -使用场景
*   -当Lambda表达式功能和某类中静态方法功能一致时，就可以使用静态方法引用
* */


public class Test {
    public static void main(String[] args) {
        
        // 1、匿名内部类形式
        myMath m1 = new myMath() {
            @Override
            public int max(int a, int b) {
                return a > b ? a : b;
            }
        };

        int max1 = m1.max(1, 2);
        System.out.println("max1 = " + max1);


        // 2、Lambda表达式形式
        myMath m2 = (int a, int b) -> {
            return a > b ? a : b;
        };
        int max2 = m2.max(1, 2);
        System.out.println("max2 = " + max2);

        // 3、静态方法引用形式
        myMath m3 = Math::max;   // 引用系统类Math中的静态方法
        int max3 = m3.max(1, 2);
        System.out.println("max3 = " + max3);


        // 4、实例方法引用
        StudentTest studentTest = new StudentTest();
        myMath m4 = studentTest::show;
        int max4 = m4.max(1,2);
        System.out.println("max4 = " + max4);

    }
}

interface myMath{
    public abstract int  max(int a, int b);
}


class StudentTest {
    public int show(int a, int b) {
        return a > b ? a : b;
    }
}