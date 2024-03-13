package com.set.arrylist;

import java.util.ArrayList;

/*
* 集合和数组的区别：
* 1、集合长度是不固定的，数组是固定长度
* 2、集合种类很多，如LinkList、Map就像数据结构中学的链表和树一样
* */
public class arrayList入门 {
    public static void main(String[] args) {
        // 1、创建一个ArrayList对象（通过文档查其构造方法，从而知道如何new）
        ArrayList arrayList = new ArrayList();
        // ArrayList<String> arrayList = new ArrayList<String>(); // 这样就是泛型，规定只能向其中添加String类型的数据


        // 2、向其中添加数据，默认放在最后，可以添加任何多种不同类型的数据，要想限制类型，可以使用泛型来处理
        arrayList.add("sxh");
        arrayList.add("abc");


        // 3、列表中的指定位置插入指定的元素
        arrayList.add(1,"php");

        // 4、获取集合大小
        // System.out.println(arrayList.size());

        // 5、根据索引删除元素，会返回被删元素的值
        System.out.println(arrayList.remove(0));

        // 6、根据元素值删除元素
        System.out.println(arrayList.remove("php"));

        // 7、修改指定位置的元素值，会返回被删元素的值
        System.out.println(arrayList.set(0, "def"));

        System.out.println(arrayList);  // 打印的是集合中的数据，并不是地址时




    }
}
