package com.sxh4._6_Stream流;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
/*

Stream<T> filter(Predicate<? super T> predicate)     用于对流中的数据进行过滤。
Stream<T> sorted()      对元素进行升序排序
Stream<T> sorted(Comparator<? super T> comparator)     按照指定规则排序
Stream<T> limit(long maxSize)       获取前几个元素
Stream<T> skip(long n)      跳过前几个元素
Stream<T> distinct()        去除流中重复的元素
Stream<R> map(Function<? super T,? extends R> mapper)      对元素进行加工，并返回对应
static<T> Stream<T> concat(Stream a, Stream b)     合并a和b两个流为一个流


*/


public class _2_Stream流中的方法 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.1, 99.0, 9.5, 99.6, 25.0);
        // 需求一：升序输出成绩 >= 60分的数据
        scores.stream().filter((Double score) -> {
            return score >= 60;
        })./*filter对流中的数据进行过滤*/
                sorted()/*sorted()默认对元素升序排序*/.forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");


        // 需求二：找出年龄大于等于23，小于等于30的学生，降序输出
        Student s1 = new Student("夏明", 25);
        Student s2 = new Student("夏明", 25);
        Student s3 = new Student("王玉", 49);
        Student s4 = new Student("张青", 37);
        List<Student> students = new ArrayList<>();
        Collections.addAll(students, s1, s2, s3, s4);
        students.stream().filter((Student s) -> {
            return s.getAge() >= 23 && s.getAge() <= 30;
        }).sorted((Student o1, Student o2) -> {
            return o2.getAge() - o1.getAge();
        }).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");


        // 需求三：输出年龄最大的3个人
        students.stream().sorted((Student o1, Student o2) -> {
            return o2.getAge() - o1.getAge();
        }).limit(3).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        // 需求四：输出年龄最小的 2个人
        students.stream().sorted((Student o1, Student o2) -> {
            return o2.getAge() - o1.getAge();
        }).skip(students.size() - 2).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        // 需求五：去除重复的元素（类在定义时需要重写equals和hashCode方法）
        students.stream().distinct().forEach((Student s) -> {
            System.out.println(s);
        });
        System.out.println("-------------------------------");

        // 需求六：对流里的元素数据类型做转换
        scores.stream().map((Double score) -> {
            return Double.toString(score);
        }).forEach((String s)-> System.out.println("s = " + s));
        System.out.println("-------------------------------");

        // 需求七：将两个流合在一起
        Stream.concat(scores.stream(), students.stream()).forEach(s -> System.out.println("s = " + s));
    }
}
