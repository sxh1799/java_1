package com.sxh2._3_抽象类.案例;

public class Cat extends Animal {

    public Cat(){}

    public Cat(String name) {
        super(name);
    }
    @Override
    public void bark() {
        System.out.println("喵喵喵~");
    }
}
