package com.java.pratice;
//dumpstack in  java that static
public class p34 extends Thread {
    public void run ()
    {
        System.out.println(Thread.currentThread());
    }
    public static void main(String[] args) {
Thread thread ;
thread = Thread.currentThread();
thread.setPriority(6);
thread.setName("main4:-");
int countThread = Thread.activeCount();
        System.out.println(countThread);
//        Thread.dumpStack();
    }
}
