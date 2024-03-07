package com.java.Aug_24_2023.Queues;

import java.util.LinkedList;
import java.util.Queue;

class implementStackUsingQueuePop_O_1 {
    Queue<Integer> qq = new LinkedList<>();

    public static void main(String[] args) {
        implementStackUsingQueuePop_O_1 stack = new implementStackUsingQueuePop_O_1();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.top());
    }

    public void push(int x) {
        qq.add(x);
        for (int i = 0; i < qq.size() - 1; i++) {
            qq.add(qq.remove());
        }


    }

    public int pop() {
        if (empty()) {
            return -1;
        }
        return qq.remove();
    }

    public int top() {
        if (empty()) {
            return -1;
        }
        return qq.peek();
    }

    public boolean empty() {
        return qq.isEmpty();
    }
}
