package com.sxh4._5_集合._1_单列集合Collection._4_Set;

import java.util.Objects;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public int compareTo(Student o) {
        /*
         * 排序规则
         * 根据本方法的返回值进行指定元素的位置
         *   如果返回值为负数，表示当前存入的元素是较小值，存左边
         *   如果返回值为正数，表示当前存入的元素是较大值，存右边
         *   如果返回值为零，表示当前存入的元素相等，不存。
         *
         *
         * this ：当前添加的元素
         *  o  ：集合中存在的元素
         * */

        // 按年龄存时，如果年龄相等的话就按名字存，不然的话存不进去
        return this.age - o.age == 0 ? this.name.compareTo(o.name) : this.age - o.age;
    }
}
