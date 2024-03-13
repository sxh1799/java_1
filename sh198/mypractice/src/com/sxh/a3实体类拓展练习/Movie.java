package com.sxh.a3实体类拓展练习;

/*
 * 电影实体类--用来封装电影的各项信息
 * */
public class Movie {

    private String id;  // 电影编号
    private String name;    // 名字
    private double score;   // 评分
    private double number;  // 想看人数
    private String director;    // 导演
    private String actor;   // 主演
    private String info;    // 描述

    public Movie(String id, String name, double score, double number, String director, String actor, String info) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.number = number;
        this.director = director;
        this.actor = actor;
        this.info = info;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
