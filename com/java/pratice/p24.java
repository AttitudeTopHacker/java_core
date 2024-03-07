package com.java.pratice;


//start the java series on multiple thread program
public class p24 extends Thread {
    public void run() {
        System.out.println("test the run and sleep function mode open :- ");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void Start() {
        this.run();
    }


    public static void main(String[] args) {
        p24 t1 = new p24();
        t1.Start();
    }
}
