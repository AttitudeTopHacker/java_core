package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 23/09/23
 * Time : 8:16 pm
 * Project_Name : java_core
 */

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList_User {


    Node Head = null;
    Node Tail = null;
    int size = 0;

    public void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void HeadLinkedList(int val) {
        Node temp = new Node(val);
        if (Head == null) {
            Head = temp;
            Tail = temp;
        } else {
            temp.next = Head;
            Head = temp;
        }
        size++;


    }


    public void TailLinkedList(int val) {
        Node temp = new Node(val);
        if (Head == null) {
            HeadLinkedList(val);

        } else {
            Tail.next = temp;
            Tail = temp;
            size++;
        }

    }

    public void middleLinkedList(int index, int val) {


        if (Head == null) {
            HeadLinkedList(val);
        } else if (size == index) {
            TailLinkedList(val);
        } else if (0 == index) {
            HeadLinkedList(val);
        }
        if (size < index || 0 > index) {
            System.out.println(index + " invalid index out of bound index linked list size is : " + size);
        } else {
            Node temp = new Node(val);
            Node t = Head;
            for (int i = 0; i < index - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
            size++;
        }
    }

    public void Delete(int index) {
        if (Head == null) {
            System.out.println("list is empty");
            return;
        } else if (0 > index || size < index) {
            System.out.println("invalid index :-");
            return;
        } else if (0 == index) {
            Head = Head.next;
            size--;
            return;
        }

        Node temp = Head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (size == index + 1) {
            Tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }


}

public class linked_list {
    public static void main(String[] args) {
        LinkedList_User listUser = new LinkedList_User();
        listUser.HeadLinkedList(34);
        listUser.TailLinkedList(23);
        listUser.TailLinkedList(42);
        listUser.middleLinkedList(1, 24);
        listUser.display();
        System.out.println();
        listUser.Delete(8);
        listUser.display();
        System.out.println();

    }
}

    