package com.sxh.a4数组的定义和访问;

public class Main {
    public static void main(String[] args) {
        // --1.静态初始化：适合一开始就知道存入那些数据
        // 完整格式定义数组(静态初始化)
        int[] wanzhengArr = new int[] {1, 2, 3};

        // 简化格式定义数组（静态初始化），工作常用
        int[] jianhuaArr = {4, 5, 6, 7};

        // 数组的遍历，使用for each
        for(int i: wanzhengArr) {
            System.out.println(i);
        }

    /*    // --2.动态初始化：一开始不知道存入哪些数据
        int[] dongtai = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < dongtai.length; i++) {
            dongtai[i] = scanner.nextInt();
        }
        for (int j : dongtai) {
            System.out.println(j);
        }*/

        // 数组小案例
        // 数组反转
        int front = 0, rear = jianhuaArr.length - 1;
        for (int i = 0; true; i++) {
            int temp = jianhuaArr[front];
            jianhuaArr[front] = jianhuaArr[rear];
            jianhuaArr[rear] = temp;
            front++;
            rear--;
            if (front >= rear) {
                break;
            }
        }

        for (int elem : jianhuaArr) {
            System.out.println(elem);
        }

    }
}
