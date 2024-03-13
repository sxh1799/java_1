package com.sxh3._4_Java常用API._8_Runtime类;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime(); // 获取当前运行环境对象
        long l = runtime.totalMemory();     // 获取虚拟机的总内存
        System.out.println("总内存l = " + l / 1024 / 1024 + "MB");

        long l1 = runtime.freeMemory();     // 获取虚拟机剩余内存
        System.out.println("剩余内存l1 = " + l1 / 1024 / 1024 + "MB");
       // runtime.exit(0);    // 终止当前虚拟机，System.exit()本质上调用的就是这个


        // 启动某个程序并返回程序对象
        Process exec = runtime.exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        Thread.sleep(5000);
       exec.destroy();     // 关闭打开的程序

    }
}
