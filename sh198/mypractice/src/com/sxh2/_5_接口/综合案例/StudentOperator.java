package com.sxh2._5_接口.综合案例;

import java.util.ArrayList;

// 学生操作类
public class StudentOperator {
    // 1、定义集合，存储多个学生
    private static ArrayList<Student> students = new ArrayList<Student>();

    // 2、利用静态代码快，初始化集合中的数据
    static {
        students.add(new Student("夏明","男",93));
        students.add(new Student("王玉","女",90));
        students.add(new Student("李华","男",99));
    }

    // 3、确定使用的是哪套按方案
        // 接口多态和类的多态一样，可以将实现该接口的对象赋值给该接口变量

    private StudentManager studentManager = new SchemeTwo();

    public void useStudentInfo() {
        // 编译看左边，执行看右边
        studentManager.printStudentInfo(students);
        studentManager.printAvgScore(students);
    }
}
