package javacode;

public class m1 implements Runnable {

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread().getName());
        } else {
            System.out.println("it is simple thread :-" + Thread.currentThread().getName());
        }
        System.out.println(Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        m1 ob = new m1();
        System.out.println("salman");
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        Thread t = new Thread(ob, "custom Thread");
        t.setDaemon(true);
        t.start();
        Thread t2 = new Thread(ob, "second name ansari");
        t2.start();
        System.out.println("main thread :-"+t.isDaemon());
    }
}
