package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int l = 0, r = st.length() - 1;
        while (l < r) {
            if (st.charAt(l) == st.charAt(r)) {
                l++;
                r--;
            } else {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

    }
}
