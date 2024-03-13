package com.sxh4._6_Stream流;

import java.util.*;
import java.util.stream.Collectors;

/*

    void forEach(Consumer action)   对此流运算后的元素执行遍历
    long count()    统计此流运算后的元素个数
    0ptional<T> max(Comparator<?super T>comparator)     获取此流运算后的最大值元素
    0ptional<T> min(Comparator<? super T> comparator)   获取此流运算后的最小值元素

就是 流调用这些方法后，流就被关闭了，就不能再使用了

 */
public class _3_Stream流中的终结方法 {
    public static void main(String[] args) {
        Student s1 = new Student("夏明", 25);
        Student s2 = new Student("夏明", 25);
        Student s3 = new Student("王玉", 49);
        Student s4 = new Student("张青", 37);
        List<Student> students = new ArrayList<>();
        Collections.addAll(students, s1, s2, s3, s4);

        // 1、统计此流运算后的元素个数
        long count = students.stream().count();
        System.out.println("count = " + count);
        System.out.println("-------------------------------");

        // 2、获取此流运算后的最大值元素
        /*
        students.stream().max() 把最大的对象放到Optional容器中
         */
        Student student = students.stream().max((Student stu1, Student stu2) -> {
            return stu1.getAge() - stu2.getAge();
        }).get();
        System.out.println("student = " + student);
        System.out.println("-------------------------------");


        // 3、收集：找出年龄大于20岁的学生，将其放到List/Set集合中
        List<Student> list_student = students.stream().filter(s -> s.getAge() > 20).collect(Collectors.toList());
        System.out.println("list_student = " + list_student);

        Set<Student> set_student = students.stream().filter((Student s) -> {
            return s.getAge() > 20;
        }).collect(Collectors.toSet());
        System.out.println("set_student = " + set_student); //Set集合会去除重复的元素

        System.out.println("-------------------------------");


        // 4、收集：找出年龄大于20岁的学生，将其放到Map集合中
        Map<String, Integer> map_student = students.stream().filter(s -> s.getAge() > 20)
                .distinct() // 由于有两个名字（key）是夏明的，所以通过distinct将过滤出来的对象去重
                .collect(Collectors.toMap(
                        (Student s) -> {
                            return s.getName(); //名字作为map的键key
                        },
                        (Student s) -> {
                            return s.getAge(); // 年龄作为map的值value
                        }
                ));
        System.out.println("map_student = " + map_student);
        System.out.println("-------------------------------");


        // 5、收集：找出年龄大于20岁的学生，将其放到数组中
        Object[] array_object = students.stream().filter((Student s) -> {
            return s.getAge() > 20;
        }).toArray();   /*如果使用空参的toArray()方法，则返回值是Object类型的数组*/
        System.out.println("array_object = " + Arrays.toString(array_object));

        /*
            如果使用有参的toArray()方法，参数是一个函数式接口
            故传入一个lambda表达式即可
            lambda表达式的形参是过滤出的元素的个数
            lambda表达式返回的是什么类型的数组，toArray返回的就是这个类型的数组
        */
        Student[] array_student = students.stream().filter((Student s) -> {
            return s.getAge() > 20;
        }).toArray((int length) -> {
            return new Student[length];
        });
        System.out.println("array_student = " + Arrays.toString(array_student));

    }
}
