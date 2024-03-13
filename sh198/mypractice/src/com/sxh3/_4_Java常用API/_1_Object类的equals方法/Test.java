package com.sxh3._4_Java常用API._1_Object类的equals方法;


import java.util.Objects;

/*
* -Object类的方法
*
* -toString（）方法
*   -未重写，输出此类对象的地址值
*   -若重写，则打印的是类的内容
*
*
* -equals()方法和 == 的区别
*   - ==
*       -比较基本数据类型——比较数据值是否相等
*       -比较引用数据类型——比较地址值是否相等
*   - equals()
*       -未重写，比较的是对象的地址值是否相等
*       -若重写，比较的是对象中的各内容是否相等
*       -编译软件有重写快捷键 alt + insert
*
* public boolean equals(Object obj) {
        return (this == obj);
    }

* */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("柳岩", 18);
        Student s2 = new Student("柳岩", 18);
        System.out.println(s1.equals(s2));
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        // o == null o如果是null则肯定不会与另一对象相等
        // getClass()获取字节码对象，同一个类的字节码对象一样
        // getClass() != o.getClass() 两个对象不属于同一个类就肯定不相等
        //  ||短路或，只要左边为真后，右边就不用判断了
        if (o == null || getClass() != o.getClass())
            return false;

        Student student = (Student) o;  // 多态的向下转型，转完后就才能调用里面的成员

        return age == student.age && Objects.equals(name, student.name);
    }


}
