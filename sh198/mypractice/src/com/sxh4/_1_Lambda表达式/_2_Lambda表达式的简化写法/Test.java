package com.sxh4._1_Lambda表达式._2_Lambda表达式的简化写法;

/*
* -参数类型可以不写
*
* -只有一个参数时， ()也可以省略
*
* -方法体重只有一条语句时，若要简写，必须将 大括号{}、分号;、return（如果该句是return语句的话）一起省略。
* */

public class Test {
    public static void main(String[] args) {
        // 接口中的方法只有一个参数，并且此方法被重写后方法体中只有一条语句，可简化！
        useInter (string-> System.out.println(string)); // 这里进行了简化
    }

    public static void useInter(inter i) {
        i.show("abc");
    }
}

@FunctionalInterface
interface inter {
    public abstract void show(String string);    // 自己定义的抽象方法

    public abstract String toString();  // 虽然这也是抽象方法，但他是Object类中的抽象方法
}

//class interImpl implements inter {
//    @Override
//    public void show() {
//        System.out.println("这是实现函数式接口的类");
//    }
//}