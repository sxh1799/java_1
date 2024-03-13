package com.sxh4._5_集合._2_双列集合Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class mapTest2_遍历 {
    public static void main(String[] args) {
        HashMap<String, String> s = new HashMap<>();
        s.put("杨过", "小龙女"); // 添加成功返回null
        s.put("郭靖", "黄蓉");
        s.put("牛魔王", "牛夫人");
        s.put("武大郎", "潘金莲");
        s.put("西门大官人", "潘金莲");

        m1(s);  // 1、通过拿到每个key，再通过key来获取其键值来

        m2(s);  // 2、利用Entry对象来做

        m3(s);  // 3、利用Map中的forEach方法
    }

    private static void m3(HashMap<String, String> s) {
        s.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "———" + value);
            }
        });
        System.out.println("____________________________");


        // 上面代码的Lambda表达式的简写形式
        s.forEach((String key, String value) -> System.out.println(key + "———" + value));
    }

    private static void m2(HashMap<String, String> s) {
        /*
         * entrySet() 是把结合中的每个键值对都封装成Entry对象，并将这些对象放入Set集合中
         * Entry是Map中的一个内部接口，所以得使用Map.Entry来调用
         * */
        Set<Map.Entry<String, String>> entries = s.entrySet();

        // 使用增强for遍历装满Entry对象的Set集合
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "———" + entry.getValue());
        }

        System.out.println("____________________________");
    }

    private static void m1(HashMap<String, String> s) {
        Set<String> keys = s.keySet();
        for (String key : keys) {
            String value = s.get(key);
            System.out.println(key + "——" + value);

        }

        System.out.println("____________________________");
    }
}
