package com.java.pratice;

class Interrupted1 extends Thread {
    public void run() {
//        System.out.println(Thread.interrupted());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
        Thread.interrupted();
                Thread.sleep(10);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}

public class p31   extends Thread  {
    public static void main(String[] args) {
        Interrupted1 I1 = new Interrupted1();
        I1.start();
        I1.interrupt();
        System.out.println(I1.isInterrupted());
    }
}
