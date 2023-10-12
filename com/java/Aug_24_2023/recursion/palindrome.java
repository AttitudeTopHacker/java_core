package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 30/09/23
 * Time : 7:11 pm
 * Project_Name : java_core
 */

public class palindrome {
    public static void main(String[] args) {
        String str = "abccba";
        if (palindromeNot(str))
            System.out.println("yes");
        else
            System.out.println("No");

    }

    private static boolean palindromeNot(String str) {
        if (str.isEmpty()) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return palindromeNot(str.substring(1, str.length() - 1));

    }
}

    