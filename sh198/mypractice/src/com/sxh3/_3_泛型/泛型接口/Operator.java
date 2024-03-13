package com.sxh3._3_泛型.泛型接口;

// 泛型接口
public interface Operator<E> {
    public abstract void saveData(E obj);

    public abstract E getData();

}

// 若省略指明，则默认泛型类型是顶级类Object
class Operator_1 implements Operator {

    @Override
    public void saveData(Object obj) {

    }

    @Override
    public Object getData() {
        return null;
    }
}


// 实现接口时，指明接口中泛型的类型，
class OperatorImpl_2 implements Operator<Teacher> {
    @Override
    public void saveData(Teacher obj) {

    }

    @Override
    public Teacher getData() {
        return null;
    }
}

// 实现接口时，用泛型类来实现，则会在确定泛型类中的类型时，相应地也会确定泛型接口的类型

class OperatorImpl_3<E> implements Operator<E> {
    @Override
    public void saveData(E obj) {

    }

    @Override
    public E getData() {
        return null;
    }
}