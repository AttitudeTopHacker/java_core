package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            System.out.print(ch + "" + (s.charAt(i + 1) - ch));
        }
        System.out.print(s.charAt(s.length()-1));
    }
}
