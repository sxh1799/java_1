package com.sxh4._6_Stream流;

import java.util.*;
import java.util.stream.Stream;

public class _1_获取Stream流 {
    public static void main(String[] args) {
        /*
        * -1、单列集合获取Stream流
        *   -单列集合的顶层接口Collection中有一个stream()方法，调用该方法可获取一个Stream对象
        *
        * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三", "李四", "王五");
        // Stream<String> stream = list.stream();   // 获取一个Stream对象
        list.stream().forEach(s -> System.out.println(s));

        System.out.println("--------------------------------------");
        /*
         * -2、双列集合获取Stream流
         *  -双列集合中没有stream方法，需要将双列集合转成单列集合
         *
         * */

        HashMap<String, String> hm = new HashMap<>();
        hm.put("周瑜", "小乔");
        hm.put("孙权", "大乔");
        hm.put("诸葛亮", "黄月英");
        // hm.keySet()返回值是单列集合Set
        hm.keySet().stream().forEach(s-> System.out.println(s + "--" + hm.get(s)));

        Set<Map.Entry<String, String>> entries = hm.entrySet(); // 这样也行
        //entries.stream().forEach(entry -> System.out.println(entry.getKey() + "--" + entry.getValue()));
        entries.stream().forEach((Map.Entry<String, String> entry) -> {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        });

        System.out.println("--------------------------------------");



        /*
         * -3、数组获取Steam流
         *  -通过Arrays工具类中的stream()方法
         *
         * */

        String[] arr = {"张三", "李四", "王五"};
        Arrays.stream(arr).forEach(s-> System.out.println(s));

        System.out.println("--------------------------------------");

        /*
         * -4、同一种类型多个数据获取Stream流
         *  -通过Steam接口的静态方法of()，会返回一个
         *
         * */
        Stream.of("张三", "李四", "王五").forEach(s-> System.out.println(s));
    }
}
