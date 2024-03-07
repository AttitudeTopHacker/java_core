package com.java.Aug_24_2023.Queues;

/**
 * create by  mohd salman
 * Date : 29/10/23
 * Time : 10:35 am
 * Project_Name : java_core
 */

public class QueueArrayDequeImplements {
    static class ArrayDeQueue {

        int[] q = new int[3];
        int  rear, size = 0;

        public void add(int data) {
            if (size == 0) rear = 0;
            else if (size == q.length) {
                System.out.println("Queue is full :-");
                return;
            }

            q[rear++] = data;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty :");
                return -1;
            }
            int pop = q[0];

            for (int i = 0; i < q.length-1; i++) {
                q[i] = q[i + 1];
            }
            q[rear-1] = 0;
            rear--;
            size--;
            return pop;

        }

        public int Top() {
            if (size == 0) {
                System.out.println("Queue is Empty : ");
                return -1;
            }
            return q[0];
        }


        public void display() {
            for (int j : q) {
                System.out.print(j + " ");
            }
        }


    }

    public static void main(String[] args) {
        ArrayDeQueue q = new ArrayDeQueue();
        q.add(1);
        q.add(2);
        q.add(3);
//        q.add(4);
        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
        q.display();
        System.out.println(q.Top());
    }

}

    