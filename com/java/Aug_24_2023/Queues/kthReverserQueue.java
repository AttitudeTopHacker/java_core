package com.java.Aug_24_2023.Queues;

import java.util.*;

/**
 * create by  mohd salman
 * Date : 29/10/23
 * Time : 6:06 pm
 * Project_Name : java_core
 */

public class kthReverserQueue {
    public static void main(String[] args) {
        Deque<Integer> qq = new ArrayDeque<>();
        Stack<Integer> st = new Stack<>();
        Queue<Integer>q=new LinkedList<>();

        int k = 4;
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        qq.add(6);
        for (int i = 0; i < k; i++) {
            st.push(qq.remove());
        }

        while (!st.isEmpty()) {
            qq.add(st.pop());
        }

        for (int i = k; i < qq.size(); i++) {
            qq.add(qq.remove());
        }
        System.out.println(qq);

    }

}

    