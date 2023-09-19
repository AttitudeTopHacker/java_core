package com.java.pratice;
//write a program thread the start of synchronized passing Object in this java
public class p33 extends Thread {
 public void run (){
     System.out.println(Thread.currentThread().getName());
     System.out.println(Thread.holdsLock(this));
     synchronized (this){
         System.out.println(Thread.holdsLock(this));
     }
     System.out.println(Thread.holdsLock(this));
 }
    public static void main(String[] args) {
        p33 t1 = new p33();
        t1.start();

    }
}
