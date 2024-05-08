package com.java.pattern;

import java.util.Scanner;

public class ptrh {
    public static void main(String[] args) {
        int s = (new Scanner(System.in)).nextInt();
        int e = (new Scanner(System.in)).nextInt();
        int p = (new Scanner(System.in)).nextInt();
        while (s <= e) {

            System.out.println((int)(5.0 / 9.0 * (s - 32)));
            s = s + p;
        }

    }
}
