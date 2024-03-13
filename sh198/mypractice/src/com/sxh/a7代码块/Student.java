package com.sxh.a7代码块;

/*
* 静态代码块，定义于类里面，static{}
* 类加载时自动执行，只执行一次
* 作用：完成类的初始化，比如对类中的静态变量进行初始化赋值
*
* */

/*
* 实例(构造)代码块：
* 每创建一个对象时就会在其构造方法前执行一次
* 本质和构造方法没啥区别，都是用来完成对象的初始化的，
* 可以抽取个构造方法的共性置于代码块中
* */
public class Student {

    static {
        System.out.println("这是静态代码块");
    }

    {
        System.out.println("这是实例代码块");
    }
    public Student() {
        System.out.println("这是无参构造");
    }
}
