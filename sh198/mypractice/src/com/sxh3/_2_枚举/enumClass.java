package com.sxh3._2_枚举;

/*
* -枚举
*   -引用数据类型，一种特殊的类
*   -类中第一行定义枚举项
*       -枚举项就是一个个常量，系统用static final修饰，
*       -每个枚举项记录的是枚举的对象
*
* -细节
*   -枚举类的构造器系统规定都是私有的，故枚举类对外不能创建对象
*   -枚举类系统用final修饰，不可以被继承
*   -枚举类中定义完枚举项以后。可以定义类的其他成员
*   -枚举类均继承lang包下的Enum类
*
*
* -应用场景
*   -把一组不变的数据定异常枚举对象，使参数值受到约束
*   -代码可读性更强
*
* */
enum A {
    Boy, Girl;    // 2个枚举项

    private A(){}   // 空参构造

    public void show() {}   // 成员方法


}

public class enumClass {
    public static void main(String[] args) {
        System.out.println(A.Boy);      // 使用枚举项

    }

}