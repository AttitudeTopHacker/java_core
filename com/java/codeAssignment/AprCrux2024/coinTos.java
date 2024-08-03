package com.java.codeAssignment.AprCrux2024;

import java.util.Scanner;

public class coinTos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Tos(N, "");
    }

    private static void Tos(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        if (ans.length()==0 || ans.charAt(ans.length()-1)!='H' ) {
            Tos(n - 1, ans + "H");
        }
        Tos(n - 1, ans + "T");
        // the added commit line of the
    }
}
