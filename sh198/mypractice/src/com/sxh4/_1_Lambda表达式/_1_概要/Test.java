package com.sxh4._1_Lambda表达式._1_概要;

/*
 * -Lambda表达式
 *   -jdk8才有，用力简化函数式接口的匿名内部类的写法
 *   -函数式接口
 *       -接口中有且仅有一个自己定义的抽象方法
 *       -实现类中可以只实现自己定义的抽象方法
 *       -一般会有注解 @FunctionalInterface
 *
 * -格式
 *    (被重写方法的形参列表) -> {
 *         被重写方法的方法体代码
 *       }
 *
 * */

public class Test {
    public static void main(String[] args) {
        useInter((String string, int a) -> {    // 匿名内部类用lambda表达式简化
            System.out.println(string + a);
        });
    }

    public static void useInter(inter i) {
        i.show("abc", 10);
    }
}

@FunctionalInterface
interface inter {
    public abstract void show(String string, int a);    // 自己定义的抽象方法

    public abstract String toString();  // 虽然这也是抽象方法，但他是Object类中的抽象方法
}

//class interImpl implements inter {
//    @Override
//    public void show() {
//        System.out.println("这是实现函数式接口的类");
//    }
//}