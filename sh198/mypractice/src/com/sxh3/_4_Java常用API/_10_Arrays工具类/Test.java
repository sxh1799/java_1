package com.sxh3._4_Java常用API._10_Arrays工具类;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntToDoubleFunction;

/*
 * -该类包含用于操作数组的各种方法（如排序和搜索）
 * -掌握几种常见的api，后期会查手册即可
 *
 * */
public class Test {
    public static void main(String[] args) {
        m1();
        m2();   // 在一些包装类中无法修改原码，所以就不能再类中实现实现Comparable接口中，所以若想用降序排序，则就只能用比较器排序

        m3();   //  自然排序，即在类中实现Comparable接口中的compareTo方法

        m4();   // 比较器排序，匿名内部类对象……

    }

    private static void m4() {
        Student s1 = new Student("李明", 19);
        Student s2 = new Student("章强", 17);
        Student s3 = new Student("王红", 23);

        Student[] students = {s1, s2, s3};
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();       // 比较器中，前 - 后 是升序排序，反之是降序排序
            }                                           // 比较器排序优先于自然排序（自排就是在类中实现接口方法的那种）
        });
        System.out.println("students =" + Arrays.toString(students));
    }

    private static void m3() {
        Student s1 = new Student("李明", 19);
        Student s2 = new Student("章强", 17);
        Student s3 = new Student("王红", 23);

        Student[] students = {s1, s2, s3};
        Arrays.sort(students);
        System.out.println("students =" + Arrays.toString(students));
    }

    private static void m2() {
        Integer[] arr2 = {2, 435, 67, 7, 887};
        // Arrays.sort(arr2);   // 默认升序排序
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);   // 使用比较器
            }
        });
        System.out.println("arr2 =" + Arrays.toString(arr2));
    }

    private static void m1() {
        int[] arr = {11, 22, 33, 44};

        String string = Arrays.toString(arr);   // 以字符串的形式输出数组
        System.out.println(string);     // [11, 22, 33, 44]

        int[] ints = Arrays.copyOfRange(arr, 0, 3); // 复制【0,3）范围内的数组
        System.out.println(Arrays.toString(ints));  // [11, 22, 33]

        int[] ints1 = Arrays.copyOf(arr, 8); // 拷贝数组，并指定新数组长度
        System.out.println("ints1 = " + Arrays.toString(ints1));  //[11, 22, 33, 44, 0, 0, 0, 0]


        double[] arr1 = {1.2, 3.9};
        Arrays.setAll(arr1, new IntToDoubleFunction() {  // 把数组中的数据修改后再存入数组
            @Override                                   // IntToDoubleFunction是一个接口，通过匿名内部类来是实现该接口
            public double applyAsDouble(int value) {    // 此用法了解即可
                return arr1[value] * 0.1;
            }
        });
        System.out.println("arr1 = " + Arrays.toString(arr1));
    }

}
