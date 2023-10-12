package com.java.Aug_24_2023.recursion;

import java.util.ArrayList;

/**
 * create by  mohd salman
 * Date : 30/09/23
 * Time : 10:01 pm
 * Project_Name : java_core
 */

public class StringSubset {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> arrayList = findSubset(str);
        System.out.println(arrayList);
    }

    private static ArrayList<String> findSubset(String str) {
        ArrayList<String> Arr = new ArrayList<>();
        if (str.isEmpty()) {
            Arr.add("");
            return Arr;
        }
        char current = str.charAt(0);
        ArrayList<String> sm = findSubset(str.substring(1));
//        Arr.addAll(sm);
        for (String s:sm){
            Arr.add(s);
            Arr.add(current+s);
        }
        return Arr;
    }
}

    