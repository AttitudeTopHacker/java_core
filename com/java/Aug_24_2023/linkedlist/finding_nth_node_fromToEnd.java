package com.java.Aug_24_2023.linkedlist;


/**
 * create by  mohd salman
 * Date : 25/09/23
 * Time : 12:07 am
 * Project_Name : java_core
 */

public class finding_nth_node_fromToEnd {
    public static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }

    }

    public static class Llist {
        Node Head = null;
        Node Tail = null;

        public void BeginAdd(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                Head = temp;
                Tail = temp;
            }
            temp.next = Head;
            Head = temp;
        }

        public void EndAdd(int val) {
            Node temp = new Node(val);
            if (Head == null) {
                BeginAdd(val);
            } else {
                Tail.next = temp;
                Tail = temp;

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

        public void displayFromIndexEnd(int start, int end) {
            Node temp = Head;
            for (int i = 0; i < end; i++) {
                if (start <= i) {
                    System.out.print(temp.data + " ");
                }
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Llist llist = new Llist();
        llist.BeginAdd(32);
        llist.EndAdd(22);
        llist.BeginAdd(34);
        llist.EndAdd(12);
        llist.BeginAdd(30);
        llist.display();
        llist.displayFromIndexEnd(2, 3);
    }
}

    