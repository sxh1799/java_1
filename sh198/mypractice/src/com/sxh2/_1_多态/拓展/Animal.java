package com.sxh2._1_多态.拓展;


public class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    public void bark() {
        System.out.println("狗叫汪汪汪");
    }
}


class Pig extends Animal{
    @Override
    public void eat() {
        System.out.println("猪吃白菜");
    }

    public void bark() {
        System.out.println("猪叫哼哼哼");
    }
}