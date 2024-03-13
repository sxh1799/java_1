package com.itheima.type_conversion;

/*
    表达式的自动类型转换
        在表达式中，小范围类型的变量，会自动转换成表达式中较大范围的类型，再参与运算。

    注意事项：
        1 表达式的最终结果类型由表达式中的最高类型决定。
        2 在表达式中，byte、short、char 是直接转换成int类型参与运算的。

        alt + enter : 快速修正代码
 */
public class Demo2 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        long l = 30;
        long result = b + i + l;


        byte bb = 10;
        short ss = 20;
        int result2 = bb + ss;

        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
    }
}
