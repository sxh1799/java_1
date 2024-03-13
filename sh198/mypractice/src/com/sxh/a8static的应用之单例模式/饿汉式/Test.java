package com.sxh.a8static的应用之单例模式.饿汉式;

import com.sxh.a8static的应用之单例模式.饿汉式.King;

public class Test {
    public static void main(String[] args) {
        King king = King.getKingInstance();
        System.out.println(king);
    }
}
