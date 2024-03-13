package com.set.案例2外卖系统;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodTest {
    public static void main(String[] args) {
        // 创建一个装Food对象的ArrayList集合
        ArrayList<Food> foods = new ArrayList<>();


        System.out.println("---------商家后台管理系统------------");
        System.out.println("添加菜品（add）");
        System.out.println("浏览菜品（query）");
        System.out.println("退出系统（exit）");
        System.out.println("请选择操作命令");
        Scanner scanner = new Scanner(System.in);

        // 创建菜品管理对象
        FoodManger foodManger = new FoodManger(foods);
        while (true) {
            String next = scanner.next();
            switch (next) {
                case "add":
                    foodManger.addFood();
                    break;
                case "query":
                    foodManger.queryFood();
                    break;
                case "exit":
                    System.out.println("已退出");
                    return;
                default:
                    System.out.println("输入有误，请重输！");
                    break;
            }
        }

    }
}
