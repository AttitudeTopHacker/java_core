package com.java.Aug_24_2023;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 15/10/23
 * Time : 11:00 am
 * Project_Name : java_core
 */

public class goodPlaying_string {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(longest_Good_Strings(s));

    }

    private static int longest_Good_Strings(String s) {
        int ans = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            } else {
                ans = count;
                count = 0;
            }


        }

        return Math.max(ans, count);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}