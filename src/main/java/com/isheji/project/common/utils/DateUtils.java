package com.isheji.project.common.utils;

import java.util.Date;

/**
 * Created by shanyao on 2018/4/15.
 */
public class DateUtils {
    /**
     * 获取num小时后的时间
     * @param hours  小时
     * @return
     */
    public static Date getTimeHoursLater(long hours) {
        return getTimeMinutesLater(hours * 60);
    }

    /**
     * 获取n分钟后的时间
     * @param minutes
     * @return
     */
    public static Date getTimeMinutesLater(long minutes) {
        return getTimeMinutesLater(minutes * 3600 * 1000);
    }

    /**
     * 获取n毫秒后的时间
     * @param millisecond
     * @return
     */
    public static Date getMillisecondLongLater(long millisecond) {
        return new Date(System.currentTimeMillis() + millisecond);
    }

}
