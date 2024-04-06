package LinkedList;

import java.util.LinkedList;

public class LinkedlistRecurrsion {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void displayRecurrsion(Node head){
        if (head ==null) return;
        System.out.print(head.data+" ");
        displayRecurrsion(head.next);
    }
    public static void main(String[] args) {

        // Making Node
        Node a= new Node(5);
        Node b= new Node(6);
        Node c= new Node(7);
        Node d= new Node(8);

        //making Connection between nodes
        a.next=b;
        b.next=c;
        c.next=d;

        System.out.println("Recurrsion --> ");
        displayRecurrsion(a);


    }
}
