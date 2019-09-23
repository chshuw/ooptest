package com.wang;

import java.util.Calendar;

public class AgeUtils {
    // 根据年月日计算年龄,birthTimeString:"1994-11-14"

    public static int getAge(String birthDay) {
        final Calendar c = Calendar.getInstance();

        if (c.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }

        String strs[] = birthDay.trim().split("-");
        int selectYear = Integer.parseInt(strs[0]);
        int selectMonth = Integer.parseInt(strs[1]);
        int selectDay = Integer.parseInt(strs[2]);

        int yearNow = c.get(Calendar.YEAR);  //当前年份
        int monthNow = c.get(Calendar.MONTH) + 1; //当前月份
        int dayNow = c.get(Calendar.DAY_OF_MONTH); //当前日期

        int age = yearNow - selectYear;  //计算整岁数
        if (monthNow <= selectMonth) {
            if (monthNow == selectMonth) {
                if (dayNow < selectDay) age--; //当前日期在生日之前，年龄减一
            } else {
                age--; //当前月份在生日之前，年龄减一
            }
        }
        return age;
    }
}
