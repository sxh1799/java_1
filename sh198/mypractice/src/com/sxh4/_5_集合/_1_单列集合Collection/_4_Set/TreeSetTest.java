package com.sxh4._5_集合._1_单列集合Collection._4_Set;

/*
* -TreeSet<E>     支持排序、无重复、无索引（底层使用红黑树实现）
*   -必须指定排序规则，支持一下两种方式
*       -1、让自定义的类实现Comparable接口，重写里面的compareTo方法来指定比较规则（自然排序）
*       -2、通过调用TreeSet集合的有参构造器，可以设置Comparator比较器对象，用于指定比较规则
*           -就是在创建TreeSet对象是，其参数是匿名内部类
*
* */

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        m1_NaturalSort();

        m2_ComparatorSort();
    }

    private static void m2_ComparatorSort() {
        // Integer类已经实现了Comparable接口，所以默认是升序排序
        // 如果想要让其降序拍，则需要使用比较器排序（优先级更高），即如下
//        TreeSet<Integer> i = new TreeSet<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1; // 逆序
//            }
//        });

        TreeSet<Integer> i = new TreeSet<>((o1, o2) -> o2 - o1);    // 把匿名内部类用Lambda表达式简写，组用于上面注释内容一模一样
        i.add(1);
        i.add(2);
        i.add(3);
        System.out.println("i = " + i);
    }

    private static void m1_NaturalSort() {
        TreeSet<Student> t = new TreeSet<>();
        t.add(new Student("夏明", 14));
        t.add(new Student("夏明义", 14));   // 尽管这两内容一样，但是由于重写了equals和hashCode方法，所以将其视作相同元素对象，会进行去重操作
        t.add(new Student("王玉", 19));
        t.add(new Student("张青", 17));

        for(Student s : t) {
            System.out.println("s = " + s);
        }
    }
}


