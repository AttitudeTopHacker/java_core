package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            System.out.print(everyEvenOdd(i, st.charAt(i)));
        }
    }

    private static char everyEvenOdd(int i, char c) {
        if (i % 2 == 0) {
            return c += 1;
        } else {
            return c -= 1;
        }
    }
}
