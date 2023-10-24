package com.java.Aug_24_2023.stackFile;

import java.util.Scanner;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 24/10/23
 * Time : 12:13 pm
 * Project_Name : java_core
 */

public class minStack {
    Stack<Long> stack = new Stack<>();
    long min;

    public void push(long val) {
        if (stack.empty()) {
            stack.push(val);
            min = val;

        } else if (min < val) {
            stack.push(val);
        } else {
            stack.push(2 * val - min);
            min = val;
        }
    }


    public void pop() {
        if (!stack.isEmpty() && stack.peek() > min) {
            stack.pop();
        } else if (!stack.isEmpty()) {
            min = 2*min - stack.peek();
            stack.pop();
        }
    }


    public int top() {

        if (!stack.isEmpty()) {
            long peek = stack.peek();
            return (int) Math.max(min, peek);
        }
        return -1;
    }

    public int getMin() {
        if (stack.isEmpty())
            return 0;
        return (int) min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
        minStack minis = new minStack();
        int[] arr = new int[]{-2, 0, -3}/*{5, 7, 3, 2, 9, 1}*/;
        for (int i = 0; i < arr.length; i++) {
//            minis.push(sc.nextInt());
            minis.push(arr[i]);
        }
        minis.pop();  /*1*/
        minis.pop();/*2*/
//        minis.pop();/*2*/
//        minis.pop();/*3*/
//        minis.pop();/*5*/
//        minis.pop();/*5*/
        System.out.println("top Element : " + minis.top());
        System.out.println("Minimum Element : " + minis.getMin());
    }


}

    