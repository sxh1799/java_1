package com.itheima.scanner;

import java.util.Scanner;

// 需求 : 键盘录入两个整数并求和
public class ScannerDemo2 {
    public static void main(String[] args) {
        // 1 创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        // 2 录入两个整数
        System.out.println("请输入第一个整数:");
        int number1 = sc.nextInt();// 100
        System.out.println("请输入第二个整数:");
        int number2 = sc.nextInt();// 200

        // 求和
        int sum = number1 + number2;
        System.out.println("sum = " + sum);

        // 键盘录入三个整数 , 求出最大值 !!!
    }
}