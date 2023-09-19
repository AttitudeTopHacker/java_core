package com.java.pratice;
//checkAccess method in java of deprecated method
public class p32 extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args)throws InterruptedException {
        p32 t1 = new p32();
        p32 t2 = new p32();
        t1.start();
        t2.start();
//        t1.checkAccess();
//        t2.checkAccess();
        t2.join();
        System.out.println("has access to the thread :-"+Thread.currentThread().getName());
int a=2;
        System.out.println(((Object)a).getClass().getName());
        System.out.println(t1.getClass().getSimpleName());
        System.out.println("has access to the thread :-"+Thread.currentThread().getName());
    }
}
