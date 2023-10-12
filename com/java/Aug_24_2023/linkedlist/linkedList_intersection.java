package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 25/09/23
 * Time : 9:57 pm
 * Project_Name : java_core
 */

public class linkedList_intersection {
    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }
    }

    public static class ListL {


        Node Head = null;
        Node Tail = null;

        public void Addfirstlink(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                temp.next = Head;
                Head = temp;
            }
        }

        public int size() {
            Node temp = Head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        public void display() {
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public void Addlastlink(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Addfirstlink(val);
            } else {
                Tail.next = temp;
                Tail = temp;
            }
        }

        public void intersection(int i, Node head, Node head1) {
            if (head == null || head1 == null) {
                return;
            }
            for (int j = 0; j < i; j++) {
                head = head.next;
            }
            while (head != null) {
                if (head.data == head1.data) {
                    System.out.println(head.data);
                    break;
                }
                head = head.next;
                head1 = head1.next;
            }

        }
    }

    public static void main(String[] args) {

        ListL listL = new ListL();
        ListL listL1 = new ListL();
        listL.Addfirstlink(21);
        listL.Addfirstlink(13);
        listL1.Addfirstlink(78);
        listL.Addfirstlink(41);
        listL1.Addfirstlink(65);
        listL.Addlastlink(23);
        listL1.Addfirstlink(80);
        listL.Addlastlink(31);
        listL1.Tail.next = listL.Tail;
        listL.Addlastlink(47);
        listL.Addlastlink(26);
        listL.Addlastlink(21);
        listL.display();
        System.out.println();
        listL1.display();
        System.out.println();
        int size = listL.size();
        int size1 = listL1.size();
        if (size1 < size) {
            listL.intersection(size - size1, listL.Head, listL1.Head);
        }
        if (size < size1) {
            listL.intersection(size1 - size, listL1.Head, listL.Head);
        } else {
            listL.intersection(0, listL1.Head, listL.Head);
        }
    }
}

    