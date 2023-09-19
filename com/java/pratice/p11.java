package com.java.pratice;
//StringJoiner in java add() function ;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class p11 {
    public static void main(String[] args) {

        StringJoiner str5 = new StringJoiner("/");
        str5.add("3");
        str5.add("12");
        str5.add("2012");
        System.out.println(str5);
    }

    public static class p15 {
        public static void main(String[] args) {
            StringTokenizer str = new StringTokenizer("the main function in the party house");
            StringTokenizer str1 = new StringTokenizer("the,main,function In,the,party,house"," ");
            while (str1.hasMoreElements()) {
                System.out.println(str1.nextElement());
            }
        }
    }

    //dumpstack in  java that static
    public static class p34 extends Thread {
        public void run() {
            System.out.println(Thread.currentThread());
        }

        public static void main(String[] args) {
            Thread thread;
            thread = Thread.currentThread();
            thread.setPriority(6);
            thread.setName("main 4:-");
            int countThread = Thread.activeCount();
            System.out.println(countThread);
    //        Thread.dumpStack();
        }
    }

    public static class p36 implements Runnable {
        public void run() {
            Thread.State state= Thread.currentThread().getState();
            System.out.println("thread is :"+state);
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getClass());
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }

        public static void main(String[] args) {
            p36 s1 = new p36();
       Thread t1=new Thread(s1);
       t1.start();
        }
    }
}
