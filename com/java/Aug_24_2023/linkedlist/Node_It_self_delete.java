package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 24/09/23
 * Time : 10:49 pm
 * Project_Name : java_core
 */


public class Node_It_self_delete {

    public static class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
        }
    }

    public static class ListNode {
        Node Head = null;
        Node Tail = null;

        public void HeadList(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                temp.next = Head;
                Head = temp;

            }
        }

        public void EndList(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                HeadList(val);
            } else {
                Tail.next = temp;
                Tail = temp;
            }
        }

        public void Display() {
            if (Head == null) {
                System.out.println("empty list:-");
            }
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.HeadList(10);
        listNode.HeadList(14);
        listNode.HeadList(44);
        Node z = new Node(50);
        listNode.Tail.next = z;
        listNode.Tail = z;
        listNode.HeadList(100);
        listNode.EndList(20);
        listNode.Display();
        z.data = z.next.data;
        z.next = z.next.next;

        System.out.println();

        listNode.Display();


    }
}

    