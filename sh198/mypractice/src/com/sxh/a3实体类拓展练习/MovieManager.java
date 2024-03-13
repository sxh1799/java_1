package com.sxh.a3实体类拓展练习;

import java.util.Scanner;

public class MovieManager {
    private Movie[] movies;

    public MovieManager(Movie[] movies) {
        this.movies = movies;
    }

    public void showAllMovies() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getId());
            System.out.println(movies[i].getName());
            System.out.println(movies[i].getScore());
            System.out.println(movies[i].getNumber());
            System.out.println(movies[i].getDirector());
            System.out.println(movies[i].getName());
            System.out.println(movies[i].getActor());
            System.out.println(movies[i].getInfo());
            System.out.println("---------------------------------");
        }
    }

    public void selectMoviesById() {
        System.out.println("请输入要查询的电影的id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < movies.length; i++) {
            if(id.equals(movies[i].getId())) {
                System.out.println(movies[i].getId());
                System.out.println(movies[i].getName());
                System.out.println(movies[i].getScore());
                System.out.println(movies[i].getNumber());
                System.out.println(movies[i].getDirector());
                System.out.println(movies[i].getName());
                System.out.println(movies[i].getActor());
                System.out.println(movies[i].getInfo());
                break;
            }
        }
        System.out.println("---------------------------------");

    }
}
