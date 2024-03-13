package com.itheima.operator_demo;

/*
    1 自增自减运算符
        自增 : ++
        自减 : --

    2 使用 :
        1) 单独使用的时候， ++和-- 无论是放在变量的前边还是后边，结果是一样的。
        2) 参与操作的时候
            如果放在变量的后边，先将该变量原本的值，取出来参与操作，随后再进行自增(++)，自减(--)。
                int a = 10;
                int b = a++;
            如果放在变量的前边，变量先完成自增长, 然后再参与运算。
                int a = 10;
                int b = ++a;
    最常见的用法：单独使用
    注意 : ++ 、-- 只能操作变量，不能操作常量
*/
public class Demo3Operator {
    public static void main(String[] args) {
        // 1 单独使用的时候 :  ++和-- 无论是放在变量的前边还是后边，结果是一样的。
        int num = 10;
        // num++;
        ++num;
        System.out.println("num = " + num);

        System.out.println("-------------");

        // 2 参与操作的时候
        // 如果放在变量的后边，先将该变量原本的值，取出来参与操作，随后再进行自增(++)，自减(--)。
//        int x = 10;
//        int y = x++;
//        System.out.println("x = " + x); // 11
//        System.out.println("y = " + y); // 10

//        int x = 10;
//        int y = ++x;
//        System.out.println("x = " + x); // 11
//        System.out.println("y = " + y); // 11

        int x = 10;
        int y = x--;
        System.out.println("x = " + x); // 9
        System.out.println("y = " + y); // 10


//        int c = 10;// 11
//        int d = 5;// 5
//        int rs3 = c++ + ++c - --d - ++d + 1 + c--;
//             // =  10 +  12 -  4  - 5   + 1 + 12
//        System.out.println(rs3);// 26
//        System.out.println(c);  // 11
//        System.out.println(d);  // 5
    }
}
