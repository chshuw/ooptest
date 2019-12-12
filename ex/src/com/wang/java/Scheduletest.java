package com.wang.java;

import java.util.concurrent.ScheduledThreadPoolExecutor;

public class Scheduletest {
    public static void main(String[] args) throws Exception{
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
        String executedEverydayAt = "12:00:00:000";
        ScheduleUtil.scheduleEveryday(executor, new Runnable(){
            public void run()
            {
                System.out.println("执行业务逻辑");
            }
        }, executedEverydayAt);
    }
}
