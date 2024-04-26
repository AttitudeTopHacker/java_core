package com.java.recursion_stundy;

public class fact {
    public static void main(String[] args) {

        int n = 5;
        int ans = 1;
        coin(n, "", 0);
    }

    public static void coin(int n, String ans, int c) {

        ///basecase
        if (n == c) {
            System.out.println(ans);
            return;
        }


if(c>n){
    return;
}

// recursivecase

        coin(n, ans + 1, c + 1);
        coin(n, ans + 2, c + 2);








    }

}
