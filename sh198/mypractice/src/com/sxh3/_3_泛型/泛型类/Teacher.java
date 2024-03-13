package com.sxh3._3_泛型.泛型类;

/*
* -格式
*   修饰符 class 类名<引用类型1, 引用类型2, ……, > {
*   }
*
* -泛型的作用
*   -提供了在编译阶段所能操作的数据类型，并进行自动检查的能力
*   -所以能避免强制类型转换可能出现的异常
*
* -泛型的本质
*   -把具体的数据类型作为参数传给类型变量
*
*
* */
public class Teacher<E> {     // 定义泛型类
    E hobby;    // 不确定hobby是什么类型就用泛型

    public E getHobby(){
        return hobby;
    }

    public void setHobby() {
        this.hobby = hobby;
    }
}

class Basketball {}
class Jump {}
class Rap {}


class Test {
    public static void main(String[] args) {
        // 创建泛型类时，在尖括号中指明泛型的具体类型
        Teacher<Basketball> teacher = new Teacher<>();
    }
}