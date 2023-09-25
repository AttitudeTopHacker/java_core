package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 25/09/23
 * Time : 7:29 am
 * Project_Name : java_core
 */

public class Nth_last_remove_node {
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

        private int SizeCheckLinkedList() {
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
            System.out.println();
        }

        public void getLastNodeDelete(int index) {
            Node slow = Head;
            Node fast = Head;
            if (Head == null) {
                return;
            }
            int size = SizeCheckLinkedList();
            if (index <= size && 0 < index) {

                for (int i = 0; i < index; i++) {
                    fast = fast.next;
                }
                if (index == 1) {
                    while (fast.next != null) {
                        fast = fast.next;
                        slow = slow.next;
                    }
                    slow.next = null;
                    Tail = slow;
                    return;
                }
                while (fast != null) {
                    fast = fast.next;
                    slow = slow.next;
                }
                slow.data = slow.next.data;
                slow.next = slow.next.next;

            } else {
                System.out.println("invalid index max index 0 to "+size);
            }
        }

    }

    public static void main(String[] args) {
        ListLinked listLinked = new ListLinked();
        listLinked.FirstAdd(34);
        listLinked.FirstAdd(23);
        listLinked.FirstAdd(64);
        listLinked.FirstAdd(32);
        listLinked.display();
        listLinked.getLastNodeDelete(3);
        listLinked.display();

    }
}