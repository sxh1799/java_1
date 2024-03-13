package com.sxh2._1_多态.拓展;
/*
* 多态的优缺点
*   - 优点：提高代码的扩展性
*   - 缺点：不能调用子类独有的方法（回顾TestPerson）
*
* 克服缺点使用“多态的转型”
*   - 向上转型：又名自动类型转换，就是把子类对象赋给父类对象 Animal animal = new Dog();
*   - 向下转型：又名强制类型转换，就是把父类对象赋给子类对象 Dog dog = (Dog) animal; 这样一来就可以调用子类中独有的方法了
*
* */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Dog(); // 向上转型
        animal.eat();  // “狗吃肉”

        Dog dog = (Dog) animal;
        dog.bark(); // 狗叫汪汪汪


    }
}
