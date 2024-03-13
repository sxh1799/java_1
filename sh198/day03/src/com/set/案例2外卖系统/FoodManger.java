package com.set.案例2外卖系统;

import java.util.ArrayList;
import java.util.Scanner;

// 菜品管理类
public class FoodManger {
    private ArrayList<Food> foods;

    public FoodManger(ArrayList<Food> foods) {
        this.foods = foods;
    }

    // 添加菜品
    public void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入菜品名称：");
        String name = scanner.next();

        System.out.println("输入菜品价格：");
        double price = scanner.nextDouble();

        System.out.println("输入菜品折后价：");
        double newPrice = scanner.nextDouble();

        System.out.println("输入菜品描述");
        String info = scanner.next();

        // 将菜品的信息封装到Food对象中
        Food food = new Food(name, price, newPrice, info);
        // 将菜品对象添加到ArrayList集合中
        foods.add(food);


    }

    // 浏览菜品
    public void queryFood() {
        for (int i = 0; i < foods.size(); i++) {
            Food food = foods.get(i);
            System.out.println("菜名：" + food.getName());
            System.out.println("原价：" + food.getOriginalPrice());
            System.out.println("优惠价：" + food.getSpecialPrice());
            System.out.println("菜品信息：" + food.getInfo());
            System.out.println("----------------------------------");
        }
    }
}
