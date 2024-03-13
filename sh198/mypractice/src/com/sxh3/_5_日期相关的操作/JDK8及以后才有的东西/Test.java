package com.sxh3._5_日期相关的操作.JDK8及以后才有的东西;

import java.time.*;

/*
* -
* */
public class Test {
    public static void main(String[] args) {
        aboutDate();

        aboutTime();

        moderateDate();

        System.out.println(LocalDateTime.now());    // 获取本地日期时间

        aboutTimeZone();
    }





    private static void aboutDate() {
        LocalDate nowDate = LocalDate.now();    // 获取本机的年月日，返回的是LocalDate对象
        int year = nowDate.getYear();   // 通过LocalDate对象获取年份、月份
        int month = nowDate.getMonthValue();
        int day = nowDate.getDayOfMonth();
        int dayOfMonth = nowDate.getDayOfMonth();
        int dayOfYear = nowDate.getDayOfYear();
        int dayOfWeek = nowDate.getDayOfWeek().getValue();
        System.out.println("今天是" + year + "年" +  month + "月" + day + "日" +
                            "，是本月的第" + dayOfMonth + "天" +
                            "，是本年的第" + dayOfYear + "天" + "，星期" + dayOfWeek);
    }

    private static void aboutTime() {
        LocalTime nowTime = LocalTime.now();    // 获取本机的时分秒对象
        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();
        int second = nowTime.getSecond();
        System.out.println("现在是" + hour + "点" + minute + "分" + second + "秒");
    }

    private static void moderateDate() {
        LocalDate nowDate = LocalDate.now();
        LocalDate localDate = nowDate.withYear(2220); // 修改日期对象中的年份，日月也是同理，都用with
        System.out.println("修改年份后的日期" + localDate);

        LocalDate localDate1 = localDate.plusYears(2); // 增加年份
        System.out.println("修改后又增加2年后的日期" + localDate1);
    }


    private static void aboutTimeZone() {
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);     // Asia/Shanghai
    }

}
