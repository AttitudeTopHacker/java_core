package com.java.pratice;

public class p6 {
    int data = 34;

    void change(p6 op1) {
        op1.data = op1.data + 100;
    }

    public static void main(String[] args) {
        p6 op = new p6();
        p6 op1 = new p6();
        op.change(op1);
        System.out.println(op1.data);
        System.out.println(op.data);
    }
}