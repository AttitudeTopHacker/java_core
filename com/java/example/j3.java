package com.java.example;
import java.util.Scanner;

//palindrome or not;
public class j3 {
    public static boolean Palindrome(int num) {
        int copy = num;
        int digit;
        int rev = 0;
        while (copy != 0) {
            digit = copy % 10;
            rev = (rev * 10) + digit;
            copy = copy / 10;
        }
        return rev == num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if (Palindrome(s)) {
            System.out.println("number is palindrome :-" + s);
        } else {
            System.out.println("number is palindrome :-" + s);
        }

    }
}
