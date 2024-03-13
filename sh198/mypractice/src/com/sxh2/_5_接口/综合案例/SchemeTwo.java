package com.sxh2._5_接口.综合案例;

import java.util.ArrayList;
import java.util.Objects;

// 方案二
public class SchemeTwo implements StudentManager{

    // 打印学生信息
    @Override
    public void printStudentInfo(ArrayList<Student> students) {
        int female = 0;
        int male = 0 ;
        for(int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student);
            if(student.getSex().equals("男")) {
                male++;
            } else {
                female++;
            }
        }

        System.out.println("男生：" + male + "人");
        System.out.println("女生：" + female + "人");
    }

    // 打印平均分（去掉最高、最低分）
    @Override
    public void printAvgScore(ArrayList<Student> students) {
        // 选择以第一个学生的分数作为最高、最低分的基准
        double min = students.get(0).getScore();
        double max = students.get(0).getScore();

        // 记录总分
        double sum =0;
        for (int i = 0; i < students.size(); i++) {
            sum += students.get(i).getScore();

            // 每个学生的分数均与基准分比较，从而获得最低分和最高分
            if(students.get(i).getScore() < min){
                min = students.get(i).getScore();
            } else if (students.get(i).getScore() > max) {
                max = students.get(i).getScore();
            }
        }

        System.out.println("去掉最高、最低分后，平均分是" + (sum - min - max) / (students.size() - 2));

    }
}
