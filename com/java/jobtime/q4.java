package com.java.jobtime;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        int n = 5 ;
        int i =0, j=0;
        while(i<n){
            while(j<n){
                if(i==0 ||j==0 ||j==n-1 || i==n-1){
                    System.out.print("*  ");
                }else {
                    System.out.print("   ");
                }
                j++;
            }
            System.out.println();
            i++;
            j=0;
        }
    }
}

