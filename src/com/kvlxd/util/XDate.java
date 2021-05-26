/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class XDate {

    static SimpleDateFormat format = new SimpleDateFormat();

    public static Date toDate(String date, String pattern) {
        try {
            format.applyPattern(pattern);
            return format.parse(date);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String toString(Date date, String pattern) {
        format.applyPattern(pattern);
        return format.format(date);
    }

    public static Date addDays(Date date, long days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    public static Date now() {
        return new Date();
    }

    public static String toString2(Date date, String... pattern) {
        if (pattern.length > 0) {
            format.applyPattern(pattern[0]);
        }
        if (date == null) {
            date = XDate.now();
        }
        return format.format(date);
    }

    public static Date add(int days) {
        Date now = XDate.now();
        now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
        return now;
    }

}
