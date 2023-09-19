package com.java.example;

import java.util.Scanner;

public class j0 {
    //Fibonacci series without recursion in java
   static  int n1 = 0, n2 = 1, n3 = 0;
    public static void fib(int num) {

        if (num > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            fib(num - 1);
        }
    }
    /*
    public static void fibonacci(int v) {
        int[] Arr = new int[v];
        try {
            for (int i = 0; i <= v; i++) {
                Arr[i] = i;
                if (i == 1 || i == 2) {
                    Arr[i] = 1;
                } else {
                    if (i != 0) {
                        Arr[i] = Arr[i - 1] + Arr[i - 2];
                    }
                }
                System.out.println(Arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {
            System.out.println("the string exception");
        }
    }
    */

    public static void main(String[] args) {
        int n;
        System.out.println("enter the number :- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
//        fibonacci(n);

        System.out.println(n1 +"\n"+n2 );
            fib(n-2);

    }
}


