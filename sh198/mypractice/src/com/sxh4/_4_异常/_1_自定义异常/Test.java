package com.sxh4._4_异常._1_自定义异常;

/*
 * -自定义异常
 *   -设计符合自己需要的异常
 *
 * -分类
 *   -直接继承RuntimeException类就是运行时异常
 *   -直接继承Exception类就是编译时异常  （比较严苛）
 *
 * */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("输入年龄：");
            int s = scanner.nextInt();
            try {
                check(s);
                break;
            } catch (Exception e) {
                System.out.println("年龄超出范围，请输入0-100之间的数");
            }
        }


    }

    private static void check(int age) {

        if (age >= 0 && age <= 100) {
            System.out.println("age = " + age);
        } else {
            // 将异常对象抛给调用者
            throw new AgeOutOfBoundException("年龄超出范围");
        }
    }
}


// 自定义的异常类
class AgeOutOfBoundException extends RuntimeException {
    public AgeOutOfBoundException() {  // 空参构造
    }

    public AgeOutOfBoundException(String message) { // 有参构造
        super(message);
    }
}