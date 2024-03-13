package com.sxh4._5_集合._2_双列集合Map;

import java.util.*;

/*
 * 总共有54张牌

 * 点数:“3“,"4“,“5”,“6”,"7“,“8","9","10","J","Q" "K","A","2

 * 花色:♠ ♥ ♦ ♣

 * 大小王: ☺ ☹

 * 斗地主:发出51张牌，剩下3张做为底牌。

 * 分析实现

 * 在启动游戏房间的时候，应该提前准备好54张牌接着，需要完成洗牌、发牌、对牌排序、看牌
 * */
public class mapTest案例2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> poker = new LinkedHashMap<Integer, String>();    // 一封牌
        ArrayList<Integer> list = new ArrayList<Integer>(); // 用于打乱牌的顺序
        String[] color = {"♠", "♥", "♦", "♣"};
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int count = 0;
        list.add(count);
        poker.put(count++, "☺");
        list.add(count);
        poker.put(count++, "☹");
        for (String num : number) {
            for (String c : color) {
                list.add(count);
                poker.put(count++, c + num);    // 组牌
            }
        }


        System.out.println("list=" + list);
        System.out.println("poker=" +poker);

        // 1、洗牌
        Collections.shuffle(list);  // 使list中的元素随机排布
        System.out.println("list=" + list);

        // 2、发牌（就是利用list中存的数字当做牌的索引，通过随机索引来获取牌）
        TreeSet<Integer> p1 = new TreeSet<>();
        TreeSet<Integer> p2 = new TreeSet<>();
        TreeSet<Integer> p3 = new TreeSet<>();
        TreeSet<Integer> lastThree = new TreeSet<>();
        for (int i = 0; i < 51; i++) {
            if (i % 3 == 0) {
                p1.add(list.get(i));
            } else if (i % 3 == 1) {
                p2.add(list.get(i));
            } else {
                p3.add(list.get(i));
            }
        }

        Collections.addAll(lastThree, list.get(51), list.get(52), list.get(53));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(lastThree);


        // 3、看牌
        m1(poker, p1);
        m1(poker, p2);
        m1(poker, p3);
        m1(poker, lastThree);
    }

    private static void m1(LinkedHashMap<Integer, String> poker, TreeSet<Integer> p1) {
        String s = "";
        for (int i : p1) {
            s = s + poker.get(i) + " ";
        }

        System.out.println("s = " + s);
    }
}
