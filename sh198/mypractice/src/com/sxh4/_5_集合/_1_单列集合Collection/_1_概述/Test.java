package com.sxh4._5_集合._1_单列集合Collection._1_概述;
/*
* -Collection<E>接口
*   -List<E>接口  输入和输出顺序一样、元素可重复、有索引  （就是线性表）
*       -ArrayList<E>实现类    （顺序表）
*       -LinkedList<E>实现类   （链表）
*
*
*   -Set<E>接口     输入和输出顺序不同（无序）、元素唯一、无索引【底层用的是Map】
*       -HashSet<E>  -无序、不重复、无索引      如果希望Set集合把2个内容相同的对象视作重复元素的话，需要重写类的equals和hashCode方法
*           -LikedHashSet<E>        有序、不重复、无索引
*       -TreeSet<E>     排序、无重复、无索引（红黑树实现）
*
*
*
*
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();  // 多态，编译看左边，执行看右边
        collection.add("吕布");   // 返回值均为true
        collection.add("张飞");
        collection.add("关云");

        System.out.println("collection = " + collection);   // 输出集合中全部元素[吕布, 张飞, 关云]

        collection.remove("吕布");    // 删除集合指定元素
        System.out.println("collection = " + collection);

        boolean t = collection.contains("张飞");  // 判断集合中是否包含张飞
        System.out.println("t = " + t);

        boolean empty = collection.isEmpty();   //判断集合是否为空
        System.out.println("empty = " + empty);

        int size = collection.size();   // 返回集合中元素的个数
        System.out.println("size = " + size);

        Object[] array = collection.toArray();  // 把集合中的元素存储到数组中
        System.out.println("array = " + Arrays.toString(array));

        // collection.addAll(另一集合);  将另一集合中的全部数据添加collection





    }
}
