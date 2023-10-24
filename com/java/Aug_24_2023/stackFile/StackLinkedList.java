package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 21/10/23
 * Time : 12:03 pm
 * Project_Name : java_core
 */
class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
    }
}

public class StackLinkedList {
    node Head = null;

    private int push(int data) {
        node temp = new node(data);
        if (Head != null)
            temp.next = Head;
        Head = temp;
        return data;
    }

    private void display() {
        node temp = Head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private int pop() {
        int top = -1;
        try {
            top = Head.data;
            Head = Head.next;
        } catch (Exception e) {
            System.out.println("Stack is Empty :- ");

        }
        return top;
    }

    private int peek() {
        int top = 0;
        try {
            top = Head.data;
            return top;
        } catch (Exception e) {
            System.out.println("Stack is Empty :- ");
        }
        return -1;
    }


    public static void main(String[] args) {
        StackLinkedList stackLinkedList = new StackLinkedList();
        System.out.println(stackLinkedList.push(23));
        System.out.println(stackLinkedList.push(223));
        System.out.println(stackLinkedList.push(213));
        System.out.println(stackLinkedList.push(3));
        System.out.println(stackLinkedList.push(43));
//        stackLinkedList.display();

        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.pop());
//        System.out.println(stackLinkedList.pop());
        System.out.println(stackLinkedList.peek());
    }


}

    