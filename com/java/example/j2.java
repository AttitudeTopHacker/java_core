package com.java.example;

import java.util.Scanner;

//prime number check or not
public class j2 {
    public static boolean primeNumber(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (primeNumber(s.nextInt())) {
            System.out.println("is prime number " + s);
        } else {
            System.out.println("is not prime :-");
        }
    }
    
}
