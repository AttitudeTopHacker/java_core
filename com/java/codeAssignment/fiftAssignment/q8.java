package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int count = 0, ans = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (isvowel(ch)) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }

        }
        ans = Math.max(ans, count);
        System.out.println(ans);
    }

    private static boolean isvowel(char ch) {
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            return true;
        }
        return false;
    }
}
