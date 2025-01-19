package com.java.jobtime;

public class q7 {
    public static void main(String[] args) {
        int n =5, i=0,j=0, sp=0;
        while(i<n){
            while (sp<i){
                System.out.print("  ");
                sp++;
            }
            while(j<n*2-(i*2)+1){
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
