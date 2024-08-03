package com.java.lecture;

public class jun24_5_keypad {
    static String[] numpad = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};

    public static void main(String[] args) {
        String s = "1234435";        //0   1     2      3   4      5      6     7     8
        kp(s, "");

    }

    private static void kp(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String st = numpad[ch - '0'];
        for (int i = 0; i < st.length(); i++) {
            kp(s.substring(1), ans + st.charAt(i));
        }
    }
}
