package com.sxh3._1_匿名内部类;

/*
*-匿名内部类
*   -是一种特殊的局部内部类，不需要为这个类声明名字
*   -本质是一个子类，会立即创建出一个子类对象
*
*
*-格式语法
*   new 抽象类/接口( ) {
*       重写抽象类/接口中的抽象方法
*   }
*
*-格式语法解释
*   -大括号{ }相当于抽象类的子类、接口的实现类，只是没有名字（匿名）
*   -new 就是创建子类对象
*
*-作用
*   -就是为了少写代码，少写了接口的实现类
*   -通常作为一个实参传给方法，一般这个实参就用一次
*   -多次使用的话不用匿名内部类
*
*
*-注意
*   -方法的返回值（或形参）如果是一个类，调用方法时需要传入该类的对象或其子类的对象
*   -方法的返回值（或形参）如果是一个接口，调用方法时需要传入该接口的实现类对象
*
*
* */
public class InnerClass {
    public static void main(String[] args) {
        // 匿名内部类，其实是创建了Inter接口的实现类对象
        Inter  inter = new Inter() {  // 用Inter类型的变量名来接收完全没问题
            public int sum(int a, int b) {
                return a + b;
            }
        };

        useInter(inter);   // 匿名内部类作为实参传递给方法，一般写成下面这种形式
//        useInter(new Inter() {
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        });
    }

    public static void useInter(Inter inter) {
        System.out.println(inter.sum(1,2));
    }


}

interface Inter {
    public abstract int sum(int a, int b);
}