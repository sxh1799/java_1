package com.sxh.a8static的应用之单例模式.懒汉式;

public class King {
    private King(){}

    private static King king;

    public static King getInstance() {

        // 懒汉式就是需要时，再创建一个对象，其余均与饿汉式一样
        if(king == null) {
            king = new King();
        }
        return king;
    }
}
