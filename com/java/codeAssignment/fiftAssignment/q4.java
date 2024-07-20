package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch += 32;
            } else {
                ch -= 32;
            }
            System.out.print(ch);
        }
    }
}
