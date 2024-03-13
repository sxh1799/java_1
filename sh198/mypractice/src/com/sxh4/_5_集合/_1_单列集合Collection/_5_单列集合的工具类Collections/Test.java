package com.sxh4._5_集合._1_单列集合Collection._5_单列集合的工具类Collections;

import java.awt.color.ColorSpace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* -Collections是集合的工具类
*   -Collections.addAll()  给集合批量添加元素
*   -Collections.shuffle(List<?> list) 打乱集合中的元素顺序
*   -Collections.sort(List<?> list) 对list集合中的元素进行升序排序
*   -Collections.sort(List<?> list, Comparator<? super T>)   对list集合中的元素，按照比较器指定的规则进行升序排序
*       -List集合自己没有排序功能，所以才会借用sort方法进行排序
*       -像Set集合，HashSet和LinkedHashSet本身没必要排序
*       -TreeSet本身自带排序，故只有List集合需要借用Collections中的sort方法
* */

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "qwe", "edc", "qaz");
        System.out.println("list = " + list);

        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);   // 降序排序
            }
        });

        System.out.println("list = " + list);

    }
}
