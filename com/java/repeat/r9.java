package com.java.repeat;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 14/02/24
 * Time : 11:44 pm
 * Project_Name : java_core
 */

public class r9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0, ans = 0;

        for (int i = 0; i < str.length(); i++) {
            if (IsCheckVowel(str.charAt(i))) {
                count++;
            } else {
                ans = count;
                count = 0;
            }

        }
        System.out.println(Math.max(ans, count));
    }

    private static boolean IsCheckVowel(char str) {
        return str == 'a' || str == 'i' || str == 'e' || str == 'o' || str == 'u';
    }
}

    