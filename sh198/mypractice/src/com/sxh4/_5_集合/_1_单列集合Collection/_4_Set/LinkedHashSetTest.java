package com.sxh4._5_集合._1_单列集合Collection._4_Set;

import java.util.LinkedHashSet;
/*
*   -LikedHashSet<E>        有序、不重复、无索引
*       -存储结构依然基于哈希表（数组、拉链法、红黑树）实现
*       -但是每个元素会向双链表那样记录前前后元素的位置，因此LinkedHashSet<E>是有序的
*       -不重复是通过哈希表来保证的，即映射到同一地址的元素相同的话就舍弃
*
* */

public class LinkedHashSetTest {
    public static void main(String[] args) {
        // 1、创建集合对象
        LinkedHashSet<String> l = new LinkedHashSet<>();

        // 2、添加元素
        l.add("Zhang");
        l.add("Li");
        l.add("Kong");
        l.add("Song");
        l.add("Song");

        // 3、遍历集合（Lambda表达式形式）
        l.forEach((String s) -> {
            System.out.println("s = " + s);
        });

//



    }
}
