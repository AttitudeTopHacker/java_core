package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 01/10/23
 * Time : 12:55 am
 * Project_Name : java_core
 */

public class SubsetWithout_space {
    public static void main(String[] args) {
        String str = "abc";
        subset(str, "");
    }

    private static void subset(String str, String crentans) {
        if (str.isEmpty()) {
            System.out.println(crentans);
            return;
        }
        char curent = str.charAt(0);
        String Remains= str.substring(1);
        subset(Remains, crentans + curent);
        subset(Remains,crentans);
    }
}

    