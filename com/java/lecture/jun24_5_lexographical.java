package com.java.lecture;

public class jun24_5_lexographical {
    public static void main(String[] args) {
        int n = 100;
        lexographical(n, 0);
    }

    private static void lexographical(int n, int ans) {
        if (ans > n) {
            return;
        }
        System.out.println(ans);
        int i = 0;
        if(ans==0){
            i=1;
        }
        for (; i <= 9; i++) {
            lexographical(n, ans * 10 + i);
        }
    }
}
