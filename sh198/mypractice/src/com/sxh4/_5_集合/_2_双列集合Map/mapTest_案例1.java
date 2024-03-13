package com.sxh4._5_集合._2_双列集合Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;



public class mapTest_案例1 {
    /*
    * 需求
    * 某个班级80名学生，现在需要组织秋游活动，
    * 班长提供了四个景点依次是(A、B、C、D)每个学生只能选择一个景点，
    * 请统计出最终哪个景点想去的人数最多。
    *
    * */
    public static void main(String[] args) {
        // 1、创建一个Map集合，景区是Character类型，对应人数是Integer类型
        HashMap<Character, Integer> hm = new HashMap<>();

        // 2、定义数组，模拟学生的选择
        char[] select = new char[80];
        Random r = new Random();
        int i = 0;
        for(char c1 : select) {
            /*
            * 用Random类的方法nextInt(int a)随机生成[0,a)之间的整数
            * 再加上65就是A~B的ASCII值，最后将其强转成char类型
            *
            * */
            c1 = (char)(r.nextInt(4) + 65);
            select[i++] = c1;

        }
        System.out.println(Arrays.toString(select));

        // 3、放进去
        for(char c1 : select) {
            if(!hm.containsKey(c1)) {
                hm.put(c1, 1);
            } else {
                hm.put(c1, hm.get(c1) + 1);
            }
        }

        // 4、遍历集合，输出结果
        hm.forEach((Character key, Integer value) -> System.out.println(key + "：" + value));

    }
}
