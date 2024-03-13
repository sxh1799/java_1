package com.sxh.a2实体类javaBean;

public class Main {
    public static void main(String[] args) {

        JavaBean bean1 = new JavaBean("张三");
        JavaBean bean2 = new JavaBean("李四");

        // 对象数组
        JavaBean[] javaBeans = new JavaBean[2];
        javaBeans[0] = bean1;
        javaBeans[1] = bean2;

    }
}
