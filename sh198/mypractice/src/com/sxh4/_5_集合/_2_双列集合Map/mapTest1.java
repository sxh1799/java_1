package com.sxh4._5_集合._2_双列集合Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
* -Map（接口）集合是键值对集合，需要存储一一对应的数据时，可以考虑用Map来搞（不重复通过后覆盖前来实现）
*   -HashMap（实现类） “键”是无序的、不重复、无索引，基于哈希表实现
*       -LinkedHashMap “键”是有序（双链表保证）、不重复、无索引
*   -TreeMap（实现类） 输出时元素按照“键”排序，不重复，无索引
*
* */
public class mapTest1 {
    public static void main(String[] args) {
    // Map接口中常用的方法（学完最顶层的接口，后面的实现类也可以用这些方法）
        HashMap<String, String> s = new HashMap<>();
        s.put("杨过", "小龙女"); // 添加成功返回null
        s.put("郭靖", "黄蓉");
        s.put("牛魔王", "牛夫人");
        s.put("武大郎", "潘金莲");
        s.put("西门大官人", "潘金莲");

        //System.out.println("s.size() = " + s.size());   // 获取集合大小
        //s.clear();  // 清空集合
        //System.out.println("s.isEmpty() = " + s.isEmpty()); // 判断集合是否为空

        System.out.println("s1 = " + s.get("郭靖"));  // 根据关键字获取值

        Set<String> keyOfS = s.keySet();    //获取map集合中所有的键key，key是无重复的，所以可以用Set集合来接收
        System.out.println("keyOfS = " + keyOfS);   // keyOfS = [西门大官人, 杨过, 牛魔王, 武大郎, 郭靖]

        Collection<String> valuesOfS = s.values();      //获取map集合中所有的值value，value是有重复的，所以用Collection来接收
        System.out.println("valuesOfS = " + valuesOfS); // valuesOfS = [潘金莲, 小龙女, 牛夫人, 潘金莲, 黄蓉]

        System.out.println("s = " + s); // 打印集合map，s = {西门大官人=潘金莲, 杨过=小龙女, 牛魔王=牛夫人, 武大郎=潘金莲, 郭靖=黄蓉}

    }
}
