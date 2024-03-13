package com.sxh2._5_接口.综合案例;

public class Student {
    private String name;
    private String sex;
    private double score;

    public Student() {
    }

    public Student(String name, String sex, double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    // 再生成一个toString方法（重写），便于打印类的内容

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }
}
