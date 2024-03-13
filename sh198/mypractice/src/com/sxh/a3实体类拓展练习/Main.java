package com.sxh.a3实体类拓展练习;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 自己弄三条电影数据
        Movie m1 = new Movie("1", "驴得水1", 8.1, 11, "张艺谋", "任素汐", "荒诞喜剧");
        Movie m2 = new Movie("2", "驴得水2", 8.2, 12, "张艺谋", "任素汐", "荒诞喜剧");
        Movie m3 = new Movie("3", "驴得水3", 8.3, 13, "张艺谋", "任素汐", "荒诞喜剧");

        // 通过有参构造 将对象数组赋给成员变量（即初始化movieManager对象）
        MovieManager movieManager = new MovieManager(new Movie[]{m1, m2, m3});


        System.out.println("===============xx电影系统=================");
        System.out.println("1.查询全部电影");
        System.out.println("2.通过电影id查询");
        System.out.println("3.退出系统");
        System.out.println("请输入您要进行的操作：");

        while(true) {

            int i = new Scanner(System.in).nextInt();
            switch (i){
                case 1:
                    movieManager.showAllMovies();
                    break;
                case 2:
                    movieManager.selectMoviesById();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("输入有误，请重新输入");
            }
            System.out.println("请输入您要进行的操作：");


        }
    }
}
