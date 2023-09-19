package com.java.pratice;

//childThread execute and main thread stop in java multiple thread
class childThread extends Thread {


    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(700);
                System.out.println("child Thread :-" + Thread.currentThread() + " " + i);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class p26 {
    public static void main(String[] args) {
        childThread test = new childThread();
        test.start();
        try {
            test.join();
            for (int i = 0; i < 5; i++) {
                Thread.sleep(700);
                System.out.println("main Thread :- " + Thread.currentThread() + " " + i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

