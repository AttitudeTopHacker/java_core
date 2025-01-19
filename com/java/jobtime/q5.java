package com.java.jobtime;

public class q5 {
    public static void main(String[] args) {
        int n =5, i=0,j=0;
        while(i<n){
            while (j<n){
                if(i==j||(j==n-i-1)){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
                j++;
            }
            System.out.println();
            i++;
            j=0;

        }
    }
}
