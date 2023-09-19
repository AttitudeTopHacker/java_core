package com.java.pratice;
//join  method in java
class test1 extends Thread {
    public void run() {
        try {
            System.out.println("medical testing................ :- " + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("test successfully Complete..... :- " + Thread.currentThread().getName());
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());

        }
    }
}

class test2 extends Thread {
    public void run() {
        try {
            System.out.println("driving test pending....... :- " + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("driving successfully Complete.- " + Thread.currentThread().getName());
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class p28 extends Thread {
    public void run() {
        try {
            System.out.println("driving licence signature :-"+Thread.currentThread().getName());
            Thread.sleep(4000);
            System.out.println("successfully licence complete."+ Thread.currentThread().getName());
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args)throws InterruptedException  {
        test1 t1= new test1();
        test2 t2 =new test2();
        p28 p1= new p28();
        t1.setName("tes1 :- ");
        t1.start();
        t1.join();
        t2.setName("test2 :-");
        t2.start();
        t2.join();
        p1.setName("p28 :-");
        p1.start();
        p1.join();
        System.out.println(t1.threadId());

    }
}

