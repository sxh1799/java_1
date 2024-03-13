package com.sxh2._5_接口.综合案例;

import java.util.ArrayList;

public interface StudentManager {
    // 功能一：打印学生信息
    public abstract void printStudentInfo(ArrayList<Student> students);


    // 功能二：打印全班学生的平均分
    public abstract void printAvgScore(ArrayList<Student> students);
}
