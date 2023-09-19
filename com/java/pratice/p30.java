package com.java.pratice;

class Interrupt extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception exception) {
            for (int i = 0; i < 3; i++) {
                System.out.println(exception.getMessage());
            }
        }
    }
}

public class p30 {
    public static void main(String[] args) {
        Interrupt I1 = new Interrupt();
        I1.start();
        I1.interrupt();
    }
}
