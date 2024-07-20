package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(st.charAt(0));
        for (int i = 1; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch != st.charAt(i - 1)) {
                System.out.print(ch);
            }
        }
    }
}