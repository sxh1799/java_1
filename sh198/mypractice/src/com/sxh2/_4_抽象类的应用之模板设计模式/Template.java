package com.sxh2._4_抽象类的应用之模板设计模式;

/*
*模板设计模式
*   -模板已经定义了通用的结构了，使用者只需要关心自己需要实现的功能即可
*   -解决了代码重复问题
*   -重复的方法放在模板类中（用finale修饰，防止被子类重写）
*   -不同的方法设计成抽象类，在子类中各自实现
*
*
* */
public abstract class Template {
    public final void write() {     // 非抽象方法用final修饰，防止被子类修改
        System.out.println("《难忘的一天》");

        body();     // 同类中非抽象方法中可以调用抽象方法

        System.out.println("这真是难忘的一天啊！");

    }

    public abstract void body();    // 抽象方法
}
