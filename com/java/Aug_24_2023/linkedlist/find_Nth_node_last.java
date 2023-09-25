package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 25/09/23
 * Time : 6:09 am
 * Project_Name : java_core
 */

public class find_Nth_node_last {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class ListLinked {
        Node Head = null;
        Node Tail = null;

        public void FirstAdd(int val) {
            Node temp = new Node(val);

            if (Head == null) {
                Head = temp;
                Tail = temp;
            } else {
                temp.next = Head;
                Head = temp;
            }
        }

        public void display() {
            Node temp = Head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void getLastNode(int index) {
           if(Head ==null)
               return;
            Node slow = Head;
            Node fast = Head;
            for (int i = 0; i < index ; i++) {
                fast = fast.next;

            }
            while (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println(slow.data);
        }
    }

    public static void main(String[] args) {
        ListLinked listLinked = new ListLinked();
        listLinked.FirstAdd(34);
        listLinked.FirstAdd(23);
        listLinked.FirstAdd(64);
        listLinked.FirstAdd(32);
        listLinked.display();
        listLinked.getLastNode(4);

    }
}

    