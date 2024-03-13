package com.sxh3._3_泛型.泛型方法;


import java.util.ArrayList;

/*
*
* -通配符泛型   ?
*   -可以代表一切泛型类型
*   -无需声明，直接使用
*   -泛型上限
*       - ? extends A
*       -表示只能接受 A 和 A的子类
*   -泛型下限
*       - ? super B
*       -表示只能接受 B 和 B的父类
*
*
**/
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<Number> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();


       // method1(list1);   // 报错，因为list1中的数据不是Number的子类，而是父类
        method1(list2);     // list2和 list3 中的数据类型均不超过Number
        method1(list3);

        method2(list1);
        method2(list2);
        // method2(list3);  // 报错，因为list3中的数据的类型低于Number

    }

    public static void method1(ArrayList<? extends Number> list) {

    }

    public static void method2 (ArrayList<? super Number> list) {

    }
}
