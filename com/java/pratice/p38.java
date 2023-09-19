package com.java.pratice;

public class p38 extends Thread {
    public void run(){

        System.out.println("this current Thread "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        p38 p= new p38();
        p38 p1= new p38();
        p.start();
        p1.start();
        Thread.UncaughtExceptionHandler handler= getDefaultUncaughtExceptionHandler();
        System.out.println(handler);
    }
}
