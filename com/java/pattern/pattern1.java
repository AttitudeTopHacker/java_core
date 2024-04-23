package com.java.pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n = 5, i = 0, m = 5, j = 0;
        while (i < n) {
            while (j < m) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
            j = 0;
        }

    }
}


//output
/*

 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *
 *  *  *  *  *     */