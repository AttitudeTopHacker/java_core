package com.java.pratice;

//yield Thread method schedule trow in java ;
class YieldMethod extends Thread {
    public void run() {
        Thread.yield();

        for (int i = 0; i < 6; i++) {

            System.out.println("Yield Method :- " + Thread.currentThread().getName() + " " + i);
        }
    }
}

public class p27 extends Thread {
    public void run() {
        try {

            for (int i = 0; i < 7; i++) {
                Thread.sleep(500);
                System.out.println("p27 :- " + Thread.currentThread().getName()+i);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) throws InterruptedException {
        YieldMethod t1 = new YieldMethod();
        p27 P27 = new p27();
        P27.start();
        t1.start();
        try {
            for (int i = 0; i < 7; i++) {
                Thread.sleep(1000);
                System.out.println("main Thread :- " + Thread.currentThread().getName() + " " + i);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
