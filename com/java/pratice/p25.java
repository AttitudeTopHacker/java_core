package com.java.pratice;

//main Thread execute that and child Thread stop the
public class p25 extends Thread {
    static Thread mainthread;

    public void run() {

        for (int i = 0; i < 8; i++) {
            try {
                mainthread.join();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        p25 childThread  = new p25();
        mainthread = Thread.currentThread();
        childThread.start();
        try {
            for (int i = 0; i < 8; i++) {
                System.out.println("main thread :- " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
