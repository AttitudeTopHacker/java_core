package com.java.Aug_24_2023.stackFile;


/**
 * create by  mohd salman
 * Date : 21/10/23
 * Time : 7:25 am
 * Project_Name : java_core
 */

class StackLimitation {
    private int index = -1;
    private final int[] arr = new int[10];

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full :-");
        } else {
            arr[index + 1] = data;
            index++;

        }
    }

    public boolean isFull() {
        return arr.length == index;
    }

    public boolean isEmpty() {

        return index == -1;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = arr[index];

        arr[index] = 0;
        index--;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty:- ");
            return -1;

        }
        return arr[index];
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        StackLimitation st = new StackLimitation();
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.pop());
        st.push(10);
        st.push(10);
        st.push(10);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }

}

    