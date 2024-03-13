package com.sxh.a8static的应用之单例模式.懒汉式;

public class Test {
    public static void main(String[] args) {
        King king = King.getInstance();
        System.out.println(king);
    }
}
