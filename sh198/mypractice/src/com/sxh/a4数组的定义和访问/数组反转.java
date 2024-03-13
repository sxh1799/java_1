package com.sxh.a4数组的定义和访问;

/*
* 原理：
* 第一个和最后一个交换
* 第二个和倒数第二个交换
* …………
* */
public class 数组反转 {
    public static void main(String[] args) {

        int[] jianhuaArr = {4, 5, 6, 7};
        int front = 0, rear = jianhuaArr.length - 1;
        for (int i = 0; true; i++) {
            int temp = jianhuaArr[front];
            jianhuaArr[front] = jianhuaArr[rear];
            jianhuaArr[rear] = temp;
            front++;
            rear--;
            // 当前面的索引大于后面索引时，表示完成翻转
            if (front >= rear) {
                break;
            }
        }

        for (int elem : jianhuaArr) {
            // 输出 7 6 5 4
            System.out.println(elem);
        }
    }
}
