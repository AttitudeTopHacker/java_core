package com.java.Aug_24_2023.linkedlist;

/**
 * create by  mohd salman
 * Date : 22/09/23
 * Time : 7:34 pm
 * Project_Name : java_core
 */

public class linkedlistnode {
    public static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
        }
    }

    public static class LinkedListUser {
        node head = null;
        node tail = null;

        public void LinkedListTails(int data) {
            node temp = new node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        public void LinkedListHead(int data) {
            node temp = new node(data);
            if (head == null) {
                tail = temp;
            } else {
                temp.next = head;
            }
            head = temp;
        }

        public void LinkedListMiddleIndex(int indx, int data) {
            if (head == null) {
                LinkedListHead(data);
            }
            node temp = new node(data);
            node t = head;

            for (int i = 1; i <= indx - 1; i++) {
                t = t.next;
                System.out.println(t.data);
            }
            temp.next = t.next;
            t.next=temp;

        }

        public void displayLinkedList() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedListUser linkedListUser = new LinkedListUser();
        linkedListUser.LinkedListTails(53);
        linkedListUser.LinkedListTails(33);
        linkedListUser.LinkedListTails(22);
        linkedListUser.LinkedListHead(1);
        linkedListUser.LinkedListMiddleIndex(1,44);
        linkedListUser.displayLinkedList();


    }
}

    