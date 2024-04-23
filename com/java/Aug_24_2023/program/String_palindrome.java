package com.java.Aug_24_2023.program;

import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        System.out.println("enter the String :-");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (isPalindromeOrNot(string)) {
            System.out.println("the String is Palindrome :-");
        } else {
            System.out.println("Not palindrome :-");
        }

    }

    private static boolean isPalindromeOrNot(String string) {
        if (string.length() == 1 || string.isEmpty()) {
            return true;
        }
        char l = string.charAt(0);
        char r = string.charAt(string.length() - 1);
        if (l == r) {
            return isPalindromeOrNot(string.substring(1, string.length() - 1));
        }else {
            return false;
        }
    }
}
