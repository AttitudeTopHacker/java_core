package com.java.example;

import java.util.Scanner;

public class j10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:-");
        int myInt1 = sc.nextInt();
        System.out.println("enter the second number:-");
        int myInt2 = sc.nextInt();
        System.out.println("print the ascii and value:-");
        for (int i = myInt1; i < myInt2; i++) {
            System.out.println("value of ascii :-  [" + i + "]  " + (char) i);
        }
    }
}
