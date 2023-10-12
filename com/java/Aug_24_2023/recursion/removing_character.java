package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 30/09/23
 * Time : 6:10 pm
 * Project_Name : java_core
 */

public class removing_character {
    public static void main(String[] args) {
        String str = "abcx";
        System.out.println(removing_char(str, 0));
    }

    private static String removing_char(String str, int indx) {
        String s = "";
        if (str.length() == indx) {
            return s;
        }
        if (str.charAt(indx) != 'a') {
            s = s + str.charAt(indx);
        }
        String smal = removing_char(str, indx + 1);
        return s + smal;
    }
}

    