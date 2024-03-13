package com.sxh2._3_抽象类;

/*
*抽象类注意事项
*   -用abstract关键字修饰
*   -本质是为抽象方法提供一个存在环境，抽象方法（无方法体）必须存在于抽象类中
*   -抽象类不能创建对象
*   -抽象类中可以存在非抽象方法
*       -抽象方法：是规则的制定者，让子类都得实现父类所有的抽象方法（或者子类也是声明为抽象类）
*       -非抽象方法：是让子类继承，提高代码的复用性
*
* 抽象类的成员特点
*   -成员变量：变、常量均可以
*   -成员方法：抽象、非抽象均可以
*   -有构造方法
*       -虽然抽象类不能创建对象，但是其子类可以访问抽象父类的构造方法来给父类的变量赋值
*       -子类中使用super关键字
* */
public abstract class abstract_demo_1 {

    int num1;   // 成员变量
    static final int num2 = 10; // 常量
    public abstract_demo_1(){}  // 空参构造

    public abstract_demo_1(int x) { //有参构造
        num1 = x;
    }

    // 下面是三个抽象方法
    public abstract void eat1();
    public abstract void eat2();
    public abstract void eat3();


    public void show() {
        System.out.println("这是非抽象方法");
    }

}

class demo2 extends abstract_demo_1{
    public demo2(int a) {
        super(a);   // 调用父类中的构造方法
    }


    // 实现父类中的抽象方法
    @Override
    public void eat1() {

    }

    @Override
    public void eat2() {

    }

    @Override
    public void eat3() {

    }
}
