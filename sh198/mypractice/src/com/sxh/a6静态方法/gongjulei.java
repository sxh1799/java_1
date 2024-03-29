package com.sxh.a6静态方法;

/*
* 类方法的应用场景是  可以设计工具类
* 工具类中的方法都会静态方法，提高了代码的复用性，调用方便，提高开发效率
* 如果工具类中的方法不是静态方法，则需要通过创建对象来调用，浪费内存
* 工具类不需要创建对象，所以建议将工具类的构造方法私有化
*
* 注意：
*       -静态方法中不能直接使用实例成员
*       -也不能使用this关键字
*       -静态方法中只能调用静态成员
*       -因为静态方法是随类加载到内存，此时并没有创建对象，故无法使用实例成员
*
*       -实例方法中可以使用静态成员
*
*
* */
public class gongjulei {
    private gongjulei(){}

    public static void jingtaifangfa(){
        System.out.println("这是工具类中的静态方法");
    }
}
