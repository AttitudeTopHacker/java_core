package com.java.pratice;

public class p9 {
        public static void main(String[] args) {
            String str1 = String.format("%10d", 101);          // Integer value
            String str2 = String.format("%10s", "Amar Singh"); // String value
            String str3 = String.format("%10f", 101.00);       // Float value
            String str4 = String.format("%10x", 101);          // Hexadecimal value
            String str5 = String.format("%10c", 'c');// Char value
            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);
            System.out.println(str5);
        }
    }

