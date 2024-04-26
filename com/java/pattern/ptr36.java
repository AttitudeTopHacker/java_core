package com.java.pattern;

import java.util.Scanner;

public class ptr36 {
    public static void main(String[] args) {

        int n = (new Scanner(System.in)).nextInt(), countNumber = 1;

        for (int i = 1; i <= n; i++) {
            int pt = 0;
            while (pt < i ) {
                System.out.print(countNumber++ + "  ");
                pt++;

            }
            System.out.println();
        }
    }
}
