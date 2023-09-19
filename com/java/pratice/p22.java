package com.java.pratice;
//interface nested class in the java or implement function that clear on write a program in java
interface OuterInterface {
    void msg();
    interface InnerInterface {
        void pasenger();
    }
}

class p22 implements OuterInterface.InnerInterface {
    public void pasenger() {
        System.out.println("public main privatemethod override :-");
    }
    public static void main(String[] args) {
        p22 callObject = new p22();
        callObject.pasenger();
    }
}
