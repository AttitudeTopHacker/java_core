package com.java.Aug_24_2023.Queues;

import com.java.Aug_24_2023.linkedlist.linkedList_intersection;

import java.util.Queue;

/**
 * create by  mohd salman
 * Date : 29/10/23
 * Time : 11:45 am
 * Project_Name : java_core
 */


class Node {
    int data;

    Node(int data) {
        this.data = data;
    }

    Node Next;
}

public class QueueLinkedList {

    Node Head = null;
    Node Tail = null;

    public void add(int data) {
        Node temp = new Node(data);
        if (Head == null) {
            Head = temp;
        } else {
            Tail.Next = temp;
        }
        Tail = temp;
    }

    public int remove() {

        if (Head == null) {
            System.out.println("Queue is Empty :-");
            return -1;
        }
        int pop = Head.data;

        Head = Head.Next;

        return pop;
    }

    public int Top() {
        if(Head==null)
            return -1;
        return Head.data;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        System.out.println(q.remove());
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q.remove());
//        System.out.println(q.remove());
        q.display();
        System.out.println();
        System.out.println(q.Top());
    }

    private void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.Next;
        }
    }
}

    