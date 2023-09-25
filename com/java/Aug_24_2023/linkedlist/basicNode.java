package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 22/09/23
 * Time : 8:02 pm
 * Project_Name : java_core
 */


class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class basicNode {

    public static void main(String[] args) {
        node a = new node(34);
        node b = new node(32);
        node c = new node(36);
        node d = new node(38);
        a.next = b;
        b.next = c;
        c.next = d;
        node temp = a;
        while (temp != null) {
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }

    }
}

    