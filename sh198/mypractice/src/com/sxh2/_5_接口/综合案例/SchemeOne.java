package com.sxh2._5_接口.综合案例;

import java.util.ArrayList;

// 方案一


public class SchemeOne implements StudentManager{

    // 功能一：打印全部学生信息
    @Override
    public void printStudentInfo(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
            System.out.println("-----------------------");
        }
    }


    // 功能一：打印学生平均成绩
    @Override
    public void printAvgScore(ArrayList<Student> students) {
        double sum = 0;
        for (int i = 0; i < students.size(); i++) {
            sum+=students.get(i).getScore();
        }

        System.out.println("平均分：" + sum/students.size());
    }
}
