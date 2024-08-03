package com.java.lecture;

import java.util.Arrays;

public class jun24_2nd_permutation {
    public static void main(String[] args) {
         String string = "aba";
        permutation(string, "");
    }
    private static void permutation(String string, String ans) {
        if (string.isEmpty()) {
            System.out.println(ans);
            return;
        }
        boolean[] visited  = new boolean[26];
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!visited[ch - 'a']) {
                visited[ch - 'a'] = true;
                String s1 = string.substring(0, i);
                String s2 = string.substring(i + 1);
                permutation(s1 + s2, ans + ch);
            }
        }
    }


}
