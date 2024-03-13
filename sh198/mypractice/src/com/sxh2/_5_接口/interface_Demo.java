package com.sxh2._5_接口;

/*
* 接口：本质是定义可一套规则框架，需要被实现
*   -关键字interface    interface 接口名
*   -接口不能创建对象（像抽象类一样）
*   -类来实现implements（一个或多个）接口（中的所有方法），或者实现类自己就是抽象类
*   -一个类可以在继承另一个类时实现（一or多个）接口
*       -class A extends B implements interfaceA, interfaceB
*
* 接口的特点
*   -成员变量：都是常量，有默认的修饰符 public static final
*       -意味着不可以被修改
*   -成员方法；
*       -jdk8以前：均为抽象方法，有默认的修饰符public abstract
*       -jdk8：增加了默认方法（）、静态方法
*           -默认方法：便于进行升级
*               -在接口中添加默认方法，实现该接口的类会直接继承该方法，无需再在类中进行实现
*               -public default 返回值 方法名() { 方法体 }， public可以省略不写
*               -类中也可以重写该方法，重写时不能有default关键字
*           -静态方法（少见）
*               -public static 返回值 方法名() { 方法体 }
*               -只能使用接口名调用该方法
*       -jdk9：增加了私有方法，只能在接口中使用，不让被继承
*           -private 返回值 方法名() { 方法体 }
*
* */
public interface interface_Demo {
    public static final int a = 10;

    public abstract void method1();
}

// 类实现了接口
class DemoImpl implements interface_Demo{
    @Override
    public void method1() {


    }
}
