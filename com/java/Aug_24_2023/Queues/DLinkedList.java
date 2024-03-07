package com.java.Aug_24_2023.Queues;

/**
 * create by  mohd salman
 * Date : 29/10/23
 * Time : 1:09 pm
 * Project_Name : java_core
 */


public class DLinkedList {
    static class Node {
        int data;

        Node(int data) {
            this.data = data;
        }

        Node Next;
        Node Pre;
    }

    Node Head = null;
    Node Tail = null;
    int size = 0;

    public void add(int data) {
        Node temp = new Node(data);
        if (Head == null) {
            Head = temp;
        } else {
            temp.Pre = Tail;
            Tail.Next = temp;
        }
        Tail = temp;
        size++;
    }

    public boolean CheckElement() {
        if (Head == null) {
            System.out.println("Queue is Empty :");
            return false;
        }
        return true;
    }

    public int remove() {
        if (!CheckElement()) {
            return -1;
        }
        int pop = Head.data;
        if (size > 1) {
            Head.Next.Pre = null;
            Head = Head.Next;
            size--;
        } else {
            Head = Tail = null;
        }
        return pop;
    }

    private void display() {
        Node temp = Head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.Next;
        }
        System.out.print("]");

    }

    private void ReversDisplay() {
        Node temp = Tail;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.Pre;
        }
        System.out.print("]");

    }

    public static void main(String[] args) {
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.add(1);
        dLinkedList.add(2);
        dLinkedList.add(3);
        dLinkedList.add(4);
        dLinkedList.add(5);
        dLinkedList.add(6);
        dLinkedList.display();
        System.out.println();
        System.out.println(dLinkedList.remove());
        System.out.println(dLinkedList.remove());
        System.out.println(dLinkedList.remove());
        dLinkedList.addFirst(8);
        dLinkedList.addFirst(9);
        dLinkedList.addLast(0);
        dLinkedList.addLast(10);
        dLinkedList.addLast(11);
        System.out.println(dLinkedList.peek());


        dLinkedList.display();

        dLinkedList.ReversDisplay();
        System.out.println(dLinkedList.removeLast());
        System.out.println(dLinkedList.peekLast());
    }

    private int peekLast() {
        if(!CheckElement()){
            return -1;
        }
        return Tail.data;
    }

    private int peek() {
        if (!CheckElement())
            return -1;
        return Head.data;
    }

    private void addLast(int data) {
        Node temp = new Node(data);
        if (!CheckElement()) {
            add(data);
        }
        temp.Pre = Tail;
        Tail.Next = temp;
        Tail = temp;

    }

    private void addFirst(int data) {
        if (!CheckElement()) {
            add(data);
        }
    }

    private int removeFirst() {
        return remove();
    }

    private int removeLast() {
        if (!CheckElement()) {
            return -1;
        }
        int pop = Tail.data;
        if (size > 1) {
            Tail = Tail.Pre;
            Tail.Next = null;
        }
        return pop;
    }


}

    