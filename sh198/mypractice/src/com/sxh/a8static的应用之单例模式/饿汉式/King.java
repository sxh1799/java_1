package com.sxh.a8static的应用之单例模式.饿汉式;

/*
* 饿汉式单例模式的创建方法（通过static实现只有单个实例）
* - 把类的构造器私有化，不允许用户创建对象
* - 在类中，创建一个对象通过静态成员变量来接收
* - 定义一个静态成员方法，返回对象，通过调用这个方法来获取唯一的对象
*
* 饿汉式单例模式优点
* - 避免频繁的创建和销毁对象
* */
public class King {
    private King() {}

    // 这样在类加载时就创建好了对象，谓之“饿汉”
    private static King king = new King();

    public static King getKingInstance() {
        return king;
    }
}
