package com.java.pratice;

//abstract method in the java of extends and@Override that clear data in java display method
abstract class Abstract {
    void display() {
        System.out.println("dfjjldsfl");
    }
}

//class Update extends Abstract {
//    public void display() {
//        System.out.println("arman");
//    }
//}

public class p18 {
    public static void main(String[] args) {
        Abstract abs = new Abstract() {
            @Override
            void display() {
                System.out.println("salman");
            }
        };
        abs.display();
//        Update up = new Update();
//        up.display();
    }
}
