package com.sxh2._3_抽象类.案例;

public class Dog extends Animal{
    public Dog(){}

    public Dog(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println("汪汪汪");
    }
}
