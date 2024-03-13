package com.sxh4._4_异常;

/*
* -异常体系
*   -异常Exception还有个兄弟Error，他两同属于lang包下的Throwable类
*   -我们只学习Exception类，Error由系统进行处理
*
*
* -异常的作用
*   -展示出现问题的信息给用户
*   -可以将问题信返回给上层调用者，修复异常
*
* -Exception类，又可以分为运行时异常、编译时异常
*   -RuntimeException类
*       -只有在运行时才出现错误
*
*   -编译时异常
*       -在编译阶段就会报错，需要进行异常处理
*
* -异常处理
*   -抛出异常 throws （甩锅）
*       -在方法上使用throws，将异常抛给方法的调用者
*       -m1() throws 异常1, 异常2, ……  {
*       -       ……
*       - }
*
*
*   -捕获异常 try {可能出现异常的代码块}
*               catch (异常的类型 变量名) {}
*               catch (异常的类型 变量名) {}
*       -try中的代码正常，正常执行，并不会走catch
*       -try中的代码出现异常，则异常语句后面的代码不会执行，会直接跳转到catch
*           -若catch没有捕获到这种类型的异常，则会抛给虚拟机（程序会被被终止）
*       -多个catch中异常类，父类只能放在最下面，起到兜底的作用
*
* */
public class Test {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            int[] arr = {1,2};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        }
    }
}
