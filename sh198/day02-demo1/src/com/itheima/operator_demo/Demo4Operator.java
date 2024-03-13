package com.itheima.operator_demo;

/*
   基本赋值运算符:
       = : 将符号右侧的数据, 赋值给左边

   扩展赋值运算符:
       +=  -=  *=  /=  %=
       运算规则 : 将符号左右两边的数据, 做加法运算, 结果赋值给左边
       注意 : 扩展的赋值运算符隐含了强制类型转换
*/
public class Demo4Operator {
    public static void main(String[] args) {
        // 基本赋值运算符:
        int a = 10;// 把10赋值给了int类型的变量a

        // 扩展赋值运算符: 将符号左右两边的数据做运算, 再将结果赋值给左边变量
        // a += 20; // a = a + 20
        // a -= 3; // a = a - 3
        a %= 4;// a = a % 4
        System.out.println("a = " + a);// 2

//        int money = 100;
//        money += 20;

        System.out.println("--------------");

        byte b = 10;
        // b = b + 20;
        // 注意 : 扩展的赋值运算符隐含了强制类型转换
        b += 20;  // b = (byte)(b + 20)
    }
}