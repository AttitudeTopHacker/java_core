package com.java.pratice;

public class p36 implements Runnable {
    public void run() {
        Thread.State state= Thread.currentThread().getState();
        System.out.println("thread is :"+state);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getClass());
            }catch (Exception e)
            {}
        }
    }

    public static void main(String[] args) {
        p36 s1 = new p36();
   Thread t1=new Thread(s1);
   t1.start();
    }
}
