package com.java.pratice;

class testIsDaemon extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                if (Thread.currentThread().isDaemon()) {
                    System.out.println("isDaemon 0 :-");
                } else {
                    System.out.println("User0 is work :-");
                }
            }
        } catch (Exception excetion) {
            System.out.println(excetion.getMessage());
        }
    }
}

class testIsDaemon1 extends Thread {
    public void run() {

        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);

                if (Thread.currentThread().isDaemon()) {
                    System.out.println("isDaemon1 :-");
                } else {
                    System.out.println("user1 is work :-");
                }

            }
        } catch (Exception excetion) {
            System.out.println(excetion.getMessage());
        }
    }
}

class testIsDaemon2 extends Thread {
    public void run() {

        try {
            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);

                if (Thread.currentThread().isDaemon()) {
                    System.out.println("isDaemon2 :-");
                } else {
                    System.out.println("user2 is work :-");
                }
            }
        } catch (Exception excetion) {
            System.out.println(excetion.getMessage());
        }

    }
}


public class p29 {
    public static void main(String[] args) throws InterruptedException {
//        p29 st = new p29();
        testIsDaemon test0isDaemone = new testIsDaemon();
        testIsDaemon test0isDaemone1 = new testIsDaemon();
        testIsDaemon test0isDaemone2 = new testIsDaemon();
        testIsDaemon1 test1isDaemone = new testIsDaemon1();
        testIsDaemon1 test1isDaemone1 = new testIsDaemon1();
        testIsDaemon1 test1isDaemone2 = new testIsDaemon1();
        testIsDaemon2 test2isDaemone = new testIsDaemon2();
        testIsDaemon2 test2isDaemone1 = new testIsDaemon2();
        testIsDaemon2 test2isDaemone2 = new testIsDaemon2();
//            test0IsDaemon
        test0isDaemone.setDaemon(true);
        test0isDaemone.start();
        test0isDaemone1.start();
        test0isDaemone2.start();


//        test0isDaemone.join();
//        test0isDaemone1.join();
//        test0isDaemone2.join();


//           test1isDaemone


        test1isDaemone.start();
        test1isDaemone1.start();
        test1isDaemone2.start();

//          test2isDaemone

        test2isDaemone.start();
        test2isDaemone1.start();
        test2isDaemone2.start();
    }
}
