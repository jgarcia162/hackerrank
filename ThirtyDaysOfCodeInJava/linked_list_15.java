/*Day 15 Linked List - https://www.hackerrank.com/challenges/30-linked-list?h_r=next-challenge&h_v=zen

Complete the insert function in your editor so that it creates a new Node
(pass  as the Node constructor argument) and inserts it at the tail of the
linked list referenced by the  parameter. Once the new node is added, return
the reference to the  node. */


import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {
	public static Node insert(Node head,int data) {
        if(head == null){
            head = new Node(data);
            return head;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        Node newNode = new Node(data);
        current.next = newNode;
        return head; 
    }
	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
