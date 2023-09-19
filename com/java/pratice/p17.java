package com.java.pratice;

class Outer$1 {
    int str1 = 45;
    void showData() {
       int h = 34;
        class Inner {
            void display() {
                System.out.println(str1++);
                System.out.println(h);
            }
        }
        Inner inner=new Inner();
        inner.display();
    }
}
class p17 {
    public static void main(String[] args) {
        Outer$1 outer = new Outer$1();
       outer.showData();
    }
}
