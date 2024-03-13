package com.sxh3._4_Java常用API._9_BigDecimal和BigInteger;


/*
* -BigDecimal类
*   -解决浮点数加减的精度不够问题
*
*   -注意事项
*       -创建BigDecimal对象方法
*           -new BigDecimal(字符串)
*           -BigDecimal.ValueOf()
*
*       -会将BigDecimal对象转为double类型
*           -对象.doubleValue()
*
* -BigInteger
*   -解决整数超限问题
*
*
* */

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Test {
    public static void main(String[] args) {
        BD();

        BI();
    }



    private static void BD() {
        // 将浮点数转为BigDecimal对象
        BigDecimal a1 = new BigDecimal(String.valueOf(0.1));  // 使用BidDecimal构造方法创建对象时，参数得是String类型
        BigDecimal b1 = new BigDecimal(String.valueOf(0.2));
        System.out.println("a1+a2=" +a1.add(b1));     // 执行加法操作

        BigDecimal c1 = BigDecimal.valueOf(0.1);    // 或者调用BigDecimal类中的静态方法创建其对象
        BigDecimal c2 = BigDecimal.valueOf(0.3);
        System.out.println("c1+c2=" +c1.add(c2));    // 加法

        System.out.println("c1-c2=" + c1.subtract(c2)); //减法
        System.out.println("c1×c2=" + c1.multiply(c2)); // 乘法
        System.out.println("c1÷c2=" + c1.divide(c2,2, RoundingMode.CEILING));   // 除法，对象1.divide(对象2, 精确几位, 舍入模式)，RoundingMode是枚举类

        double v = c1.doubleValue();    // 将BigDecimal对象转回double类型
    }
    private static void BI() {
        BigInteger a1 = new BigInteger("100000000000000000000000000");  // 讲过大的整数转为BigInteger类型的对象
        BigInteger b1 = new BigInteger("100000000000000000000000000");
        System.out.println("a1+a2=" + a1.add(b1));
    }
}
