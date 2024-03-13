package com.sxh3._4_Java常用API._5_StringJoiner的用法;

import java.util.StringJoiner;

// 用来拼接符号，相比直接用String拼接效率更高，比用StringBuilder代码更简洁
public class Test {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            stringJoiner.add(Integer.toString(arr[i]));
        }
        System.out.println("stringJoiner= " + stringJoiner.toString());
    }
}
