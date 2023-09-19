package com.java.pratice;

public class p35 extends Thread {
    public p35(ThreadGroup threadGroup, String string) {
        super(threadGroup, string);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(10);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println(Thread.currentThread().getName());

    }

    public static void main(String[] args) {

        ThreadGroup g1 = new ThreadGroup("Parent");
        ThreadGroup g2 = new ThreadGroup(g1, "child");
        p35 p1 = new p35(g1, "thread-1");
        p35 p2 = new p35(g2, "thread-2");

        Thread[] threadsgroups = new Thread[g1.activeCount()];
        int count = g1.enumerate(threadsgroups);
        for (int i = 0; i < count; i++) {
            System.out.println(threadsgroups[i].getName());
        }
    }
}

