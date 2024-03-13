package com.测试;

public class King {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.name);
    }
}

class Fu {
    String name = "gool";
}

class Zi extends Fu{
    String name = "bai";
}

