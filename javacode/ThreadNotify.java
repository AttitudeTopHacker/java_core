package javacode;

/**
 * create by  mohd salman
 * Date : 02/02/24
 * Time : 5:58 pm
 * Project_Name : java_core
 */

class totalIncome extends Thread {
    int total = 0;

    public void run() {
        synchronized (this) {
            for (int i = 0; i < 103; i++) {
                total += i;
            }
            notify();
        }
    }

}

public class ThreadNotify {
    public static void main(String[] args)throws InterruptedException {
        totalIncome ob = new totalIncome();
        ob.start();
//        System.out.println(ob.total);
        synchronized (ob) {
            ob.wait();
            System.out.println(ob.total);
        }
    }

}

    