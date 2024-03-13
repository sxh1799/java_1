package com.sxh4._3_正则表达式;

/*
* -正则表达式
*   -由一些特定字符组成的一种校验规则
*
* -作用
*   -校验数据格式是否合法
*   -在一段文本中查找满足要求的内容
*
* -正则语法部分示例
*   - . 表示任意一个字符
*   -[abc] 表示字符a、b或c，不加[]的话表示字符串必须是abc，下同
*   -[^abc] 除了a、b、c以外的一个字符
*   -[a-zA-Z] a到z、A-Z之间的一个字符
*   -[a-d[m-p]] a到d 或 m到 p之间的字符
*   -[a-z&&[^bc]]   a到z，除了b、c中的一个字符
*   -[a-z&&[^m-p]]  a到z，除了m到p中的一个字符
*
* -以下内容写在代码中，需要两个反斜杠\\，不然系统以为是转义字符
*   -\d 表示一个0-9中数字，等价于[0-9]
*   -\D 表示一个非数字字符，等价于[^0-9]
*   -\s 表示一个空白字符
*   -\S 表示非空白字符 ，等价于[^\s]
*   -\w 表示a-z、A-Z、_、0-9这些字符中的一个，等价于[a-zA-Z_0-9]
*   -\W     \w的反义
*
*
*
*   -X? 表示一个字符出现0次或1次，书写时X可以替换成任意字符，或替换为多个字符也可以，如(abc)+，表示abc可以出现多次
*   -X* 表示一个字符出现0次或多次
*   -X+ 表示一个字符出现1次或多次
*   -X{n}   表示一个字符出现n次
*   -X{n,}   表示一个字符出现大于等于n次
*   -X{n,m} 表示一个字符出现n到m次
*   -(?!)abc 表示忽略abc的大小写
*   -a((?!)b)c 表示忽略b的大小写
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    /*
    * m1需求：匹配手机号、座机号
    *   手机号：第一位只能是1，第二位是3/5/8，后面9位随意
    *   座机号：区号第一位为0，长度是3-4位数字，除区号外，剩下的号码第一位非0，长度是5-20位
    *       两种格式，如 010-12345678、01012345678
    *
    * */

    /*
    * m2需求：
    *   把“张三23sdf李四skdjfk3王五sdji赵六sdjkf2冯七”字符串中的非汉字部分替换为-
    *   即 “张三-李四-王五-赵六-冯七”
    *
    * */
    public static void main(String[] args) {
        //m1();
        m2();

    }

    private static void m1() {
        System.out.println("输入号码：");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String s = scanner.nextLine();
            boolean matches = s.matches("(1[358]\\d{9})|(0[1-9]\\d{1,2}-?[1-9]\\d{4,19})");
            if (matches) {
                System.out.println("号码符合规则");
            } else {
                System.out.println("号码不符合规则");
            }

        }
    }

    private static void m2() {
        String s = "张三23sdf李四skdjfk3王五sdji赵六sdjkf2冯七";
         String s1 = s.replaceAll("\\w+", "-");
        System.out.println("s1 = " + s1);

        String[] split = s.split("\\w+");
        System.out.println("Arrays.toString(split) = " + Arrays.toString(split));

    }
}
