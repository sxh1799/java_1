package com.sxh2._1_多态;

public class Person {
    public void run() {
        System.out.println("---");
    }
}

class Student extends Person {
    @Override
    public void run() {
        System.out.println("学生跑……");
    }
}

class Teacher extends Person {
    @Override
    public void run() {
        System.out.println("老师跑");
    }
}