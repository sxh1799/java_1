package com.sxh.a5静态变量static修饰的变量;

public class Test1 {
    public static void main(String[] args) {
        Student.name = "赵云";
        Student student = new Student();
        System.out.println(student.name);


    }
}
