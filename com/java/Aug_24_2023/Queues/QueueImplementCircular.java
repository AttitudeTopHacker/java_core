package com.java.Aug_24_2023.Queues;

/**
 * create by  mohd salman
 * Date : 29/10/23
 * Time : 8:48 am
 * Project_Name : java_core
 */

//********************************circular !=Queue Implementation in the java ********************************
public class QueueImplementCircular {
    static class Queues {
        int[] q = new int[3];
        int front = -1, rear = -1, size = 0;

        public void add(int data) {
            if (size == 0) {
                front = rear = 0;
            } else if (size == q.length ) {
                System.out.println("stack is full :-");
                return;
            }
            if (rear == q.length ) {
                rear = 0;
            }
            q[rear] = data;
            rear++;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty :-");
                return -1;
            }
            size--;
            int pop = q[front];
            q[front] = 0;
            front++;
            return pop;
        }

        public void display() {
            for (int j : q) {
                System.out.print(j + " ");
            }
        }

    }

    public static void main(String[] args) {
        Queues q = new Queues();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(21);
//        q.add(76);
//        q.add(54);
        q.display();
//        q.add(8);
    }
}

    