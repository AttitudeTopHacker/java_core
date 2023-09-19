package com.java.pratice;

import java.util.Scanner;

//fibonacci without recurssion
public class p5 {
    static int fibonacci(int n) {
        /*if (n==1||n==2)
        {
            return 1;
        }else if (n==0){
            return 0;
        }*/
        if (n<=1)
        {
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static class p39 extends Thread {
        public void run() {
            throw new RuntimeException();
        }

        public static void main(String[] args) {
            p39 t= new p39();
            Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("Exception caught: " + e);
                }
            });
             t.start();
        }
    }
}
