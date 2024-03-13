package com.sxh3._4_Java常用API._4_StringBuilder的用法;

/*
* -StringBuilder类的构造方法
*   - new StringBuilder(); 返回一个空白的可变长度的字符串（SB对象）对象
*   - new StringBuilder(“字符串”);
*
* -public StringBuilder append(任意数据类型)
*   - 可以将任意数据类型都添加到可变字符串（SB对象）中
*
* -public StringBuilder reverse(SB对象);
*   -将SB对象内容反转
*
* -public int length(SB对象);
*   -返回SB对象的内容的长度
*
* -public String toString();
*   -将SB对象转为字符串String
*
*
* -SB对象相较于String的优势
*   -在拼接大量字符串时，SB的效率高得多
*
* */
public class Test {
    public static void main(String[] args) {
        m1();   // 知识点


//        int[] a = new int[] {1,2,3,4,5};
        int[] a = new int[] {};
        m2(a);
    }

    private static void m1() {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println("sb = " + sb);

        sb.append(123).append(true).append(3.14).append('q');   // append的返回值是sb对象，所以可以进行这样的链式编程
        System.out.println("sb = " + sb);

        sb.reverse();
        System.out.println("sb = " + sb);

        String s = sb.toString();
        System.out.println("s = " + s);
    }

    // 将数组转为字符串输出
    private static void m2(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if(i < a.length - 1){
                sb.append(',');
            }
        }

        sb.append(']');
        System.out.println("sb = " + sb);
    }
}
