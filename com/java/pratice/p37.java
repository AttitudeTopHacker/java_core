package com.java.pratice;


class class_loader implements Runnable{
    public void run () {
        System.out.println("Start Thread :-");
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        Thread.currentThread().setContextClassLoader(loader);
        System.out.println("Class_loader"+ loader);
    }

}

public class p37 {
    public static void main(String[] args) {
class_loader Class= new class_loader();
Thread t1= new Thread(Class);
t1.start();
    }
}
