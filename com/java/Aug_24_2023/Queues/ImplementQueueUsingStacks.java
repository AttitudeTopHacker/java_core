package com.java.Aug_24_2023.Queues;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 04/11/23
 * Time : 6:14 pm
 * Project_Name : java_core
 */

public class ImplementQueueUsingStacks {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    public void push(int value) {
        if (st1.isEmpty()) {
            st1.push(value);
        } else {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
            st2.push(value);
            while (!st2.isEmpty()) {
                st1.push(st2.pop());
            }
        }
    }

    public int pop() {
        if (st1.isEmpty()) {
            return -1;
        } else {
            return st1.pop();
        }
    }

    public int peek() {

        if (st1.isEmpty()) {
            return -1;
        } else {
            return st1.peek();
        }
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacks obj = new ImplementQueueUsingStacks();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
//        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
//        System.out.println(obj.pop());
//        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
    }

}

    