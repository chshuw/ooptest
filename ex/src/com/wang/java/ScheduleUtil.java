package com.wang.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 每天定时上传数据的实现
 */
public class ScheduleUtil {
    private static DateFormat format() {
        return new SimpleDateFormat("HH:mm:ss:SSS");
    }

    private static Date parseTime(String time) throws ParseException {
        return format().parse(time);
    }

    private static long getOneDayMilliseconds() {
        return 24 * 60 * 60 * 1000L;
    }

    private static long getMillisecondsInOneDayBetween(String now, String future) throws ParseException {
        Date nowDate = parseTime(now);
        Date futureDate = parseTime(future);
        long nowTime = nowDate.getTime();
        long futureTime = futureDate.getTime();
        if (futureTime > nowTime) {
            return futureTime - nowTime;
        } else {
            return (futureTime + getOneDayMilliseconds()) - nowTime;
        }
    }

    public static void scheduleEveryday(ScheduledThreadPoolExecutor executor, Runnable command,
                                        String executedEverydayAt) throws ParseException {
        long initialDelay = getMillisecondsInOneDayBetween(format().format(new Date()), executedEverydayAt);
        long period = getOneDayMilliseconds();
        executor.scheduleAtFixedRate(command, initialDelay, period, TimeUnit.MILLISECONDS);
    }
}
