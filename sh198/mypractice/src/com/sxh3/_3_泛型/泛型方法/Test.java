package com.sxh3._3_泛型.泛型方法;

/*
* -泛型方法
*   -修饰符 <泛型声明，泛型声明，……> 返回值类型 方法名(泛型形参) {
*       }
*
*   -针对形参的，在形参有多重类型的时候选择使用泛型
*
* -通配符泛型   ?
*   -可以代表一切泛型类型
*   -无需声明，直接使用
*
* */
public class Test {
    public static void main(String[] args) {
        show("abc");
        show(1);
    }

    public static <T> void show(T t) {
        if(t instanceof String) {
            System.out.println("String");
        }

        if (t instanceof Integer) {
            System.out.println("int");
        }
    }
}
