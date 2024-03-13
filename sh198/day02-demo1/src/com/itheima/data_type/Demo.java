package com.itheima.data_type;
/*
    数据类型的分类
		A:基本数据类型 : 四类八种
			1 整数类型 : byte(1) , short(2) , int(4) , long(8)
			2 浮点类型 : float(4) , double(8)
			3 字符类型 : char(2)
			4 布尔类型 : boolean(1)

		B:引用数据类型 : 数组 , 类 , 接口 , 枚举

	注意 :
		1 整数默认是int类型        100 -> int   123 -> int
		2 小数默认是double类型     12.12 -> double
		3 定义float类型变量时.数据后面需要加上f或者F , 建议加上F
		4 定义long类型变量时 .数据后面需要加上l或者L , 建议加上L

	需求 : 定义四类八种类型的变量 , 并打印
 */

public class Demo {
    public static void main(String[] args) {
        // 变量格式 : 数据类型  变量名 = 数据值;
        byte b = 10;
        System.out.println(b);

        short s = 20;
        System.out.println(s);

        int i = 100;
        System.out.println(i);

        /*
            整数默认是int类型
         */
        // long ln = 10000000000;
        long ln = 1000000000000L;
        System.out.println(ln);

        /*
            小数默认是double类型
            12.12属于double类型 , 数据的类型大于float的类型, 所以float无法接受double类型数据
         */
        // float f = 12.12;
        float f = 12.12F;
        System.out.println(f);

        double d = 13.13;
        System.out.println(d);

        char ch = 'a';
        System.out.println(ch);

        boolean bb = true;
        System.out.println(bb);
    }
}
