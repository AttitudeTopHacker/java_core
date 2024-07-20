package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cnt++;
            } else {
                System.out.print(s.charAt(i - 1));
                System.out.print(cnt);
                cnt = 1;
            }
        }
        System.out.print(s.charAt(s.length()-1));
        System.out.print(cnt);
    }
}
