package com.sxh4._5_集合._1_单列集合Collection._3_ArrayList;

import java.util.ArrayList;

import java.util.List;

/*
 * -List接口的特有方法
 *   -void add(int index, E ele) 在集合指定位置添加元素
 *   -E remove(int index)  删除指定所引处的元素，同时返回被删除的元素
 *   -E set(int index, E ele) 修改指定位置的元素，并返回之
 *   -E get(int index) 返回指定位置处的元素
 *
 * -ArrayList底层原理
 *   -顺序表
 *   -利用无参构造器创建ArrayList集合时，系统会创建一个默认长度为0的数组
 *   -添加第一个元素是，底层会创建一个新的长度为10的数组
 *   -当数组存满时，一次会扩容1.5倍
 *
 * */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // 多态，编译看左边，执行看右边
        list.add("吕布");   // 返回值均为true
        list.add("张飞");
        list.add("关云");
        list.add(3, "刘备");
        System.out.println("list = " + list);

        System.out.println("_____________________________");
        String remove = list.remove(0);
        System.out.println("remove = " + remove);
        System.out.println("list = " + list);

        System.out.println("_____________________________");
        list.set(0, "李逵");
        System.out.println("list = " + list);

        System.out.println("_____________________________");
        String s = list.get(0);
        System.out.println("s = " + s);


    }
}
