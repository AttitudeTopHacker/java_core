package com.java.pattern;

import java.util.Scanner;
//Hollow Rhombus Pattern
public class ptra {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();

        for (int i = 0; i < n; i++) {
            int sp = 0;
            while (sp < n - (i + 1)) {
                System.out.print(" ");
                sp++;
            }
            for (int j = 0; j < n; j++) {
                if (i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


//Hollow Rhombus Pattern

//
//    *****
//   *   *
//  *   *
// *   *
//*****