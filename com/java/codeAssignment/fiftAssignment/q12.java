package com.java.codeAssignment.fiftAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int[] ch = new int[26];
        for (int i = 0; i < st.length(); i++) {
            ch[st.charAt(i) - 'a']++;
        }
        int ans = 0, index = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] > ans) {
                ans = ch[i];
                index = i;
            }
        }
        System.out.println((char) (index + 97));
    }
}
