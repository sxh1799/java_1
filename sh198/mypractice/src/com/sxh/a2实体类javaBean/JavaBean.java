package com.sxh.a2实体类javaBean;

/*
 * 一个JavaBean类对应数据库的一张表
 * 该类的属性全部私有，必须得有无参构造器；需要提供get set方法！
 * 一个JavaBean对象对应表中的一行数据
 *
 * */
public class JavaBean {
    private String name;

    // 无参构造
    public JavaBean() {
    }

    // 全参构造，快捷键  alt + insert
    public JavaBean(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}
