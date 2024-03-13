package com.sxh4._5_集合._1_单列集合Collection._2_集合List的遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/*
* -Collection集合的遍历
*   -通过迭代器iterator类
*       -遍历时通过hasNext方法判断是否还有下一个元素
*       -通过next方法获取当前元素的值
*       -就类似于线性表的指针一样
*   -增强for循环
*       -for(数据类型 变量名 : 集合或数组名) {}
*       -底层还是迭代器
*       -用来遍历集合或者数组
*   -forEach方法
*
*
*
* */

public class Test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();  // 多态，编译看左边，执行看右边
        collection.add("吕布");   // 返回值均为true
        collection.add("张飞");
        collection.add("关云");

        // 1、使用迭代器遍历
        /*
        * 注意：使用迭代器进行遍历时，
        * 若想删除符合条件的元素，不能使用集合对象中的remove方法，会出现并发异常
        * 可以使用迭代器中remove方法
        * */

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 2、使用增强for循环来遍历
        for(String s : collection) {
            System.out.println("s = " + s);
        }


        // 3、使用forEach
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
