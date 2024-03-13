package com.itheima.scanner;
// 1 导包

import java.util.Scanner;
/*
    键盘录入的三个步骤
        1 导包 : 需要放在类的上面 , package的下面
            import java.util.Scanner;
        2 创建键盘录入对象
            Scanner sc = new Scanner(System.in);
        3 录入数据
            int 变量名 = sc.nextInt();
 */

public class ScannerDemo {
    public static void main(String[] args) {
        // 2 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串:");
        // // 3 录入数据 , String类型
        String s = sc.next();
        System.out.println(s);

//        System.out.println("请输入一个整数:");
//        // 3 录入数据 , int类型
//        int number = sc.nextInt();// 123
//
//        System.out.println(number);
    }
}