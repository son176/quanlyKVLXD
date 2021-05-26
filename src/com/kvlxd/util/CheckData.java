/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kvlxd.util;

/**
 *
 * @author Admin
 */
public class CheckData {

    public static boolean isNull(String s) {
        if (s.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDouble(String c) {
        try {
            Double.parseDouble(c);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isInt(String c) {
        if (isDouble(c)) {
            try {
                Integer.parseInt(c);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean sdt(String s) {
        String mau = "^[0-9]{9,10}$";
        if (s.matches(mau)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean email(String e) {
        String mau = "^[0-9a-zA-Z]+@[0-9a-zA-Z]+(\\.[0-9a-zA-Z]+)+$";
        if (e.matches(mau)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkNgay(String s) {
        String mau = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
        if (s.matches(mau)) {
            int year = Integer.parseInt(s.substring(0, 4));
            int month = Integer.parseInt(s.substring(5, 7));
            int day = Integer.parseInt(s.substring(8, 10));
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: {
                    return true;
                }
                case 2: {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        if (day <= 29) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
                case 4:
                case 6:
                case 9:
                case 11: {
                    if (day <= 30) {
                        return true;
                    } else {
                        return false;
                    }
                }
                default:
                    return false;
            }
        } else {
            return false;
        }
    }
}
