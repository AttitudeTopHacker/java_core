package com.java.Aug_24_2023.Queues;

import java.util.LinkedList;
import java.util.Queue;

/**
 * create by  mohd salman
 * Date : 29/10/23
 * Time : 8:16 pm
 * Project_Name : java_core
 */

//   space O(1);
//    time O(n);
public class implementStackUsingQueues {
    public implementStackUsingQueues() {

    }

    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        if (empty()) return -1;
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }

    public int top() {
        if (empty()) {
            return -1;
        } else {
            for (int i = 0; i < q.size() - 1; i++) {
                q.add(q.remove());

            }
            int top = q.peek();
            q.add(q.remove());
            return top;
        }
    }

    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        implementStackUsingQueues stackUsingQueues = new implementStackUsingQueues();
        stackUsingQueues.push(1);
        stackUsingQueues.push(2);
        stackUsingQueues.push(3);
        stackUsingQueues.push(4);
        System.out.println(stackUsingQueues.q);
        System.out.println(stackUsingQueues.top());
        System.out.println(stackUsingQueues.pop());

    }

}

    