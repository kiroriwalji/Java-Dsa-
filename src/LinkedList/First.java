package LinkedList;

import java.util.LinkedList;

public class First {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
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

        // using For loop

        System.out.println("Using For Loop => ");
        Node temp = a;
        for(int i =0;i<4;i++){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Using while Loop => ");

        Node t = a;
        //using while loop
        while(t!=null){
            System.out.print(t.data+" ");
            t = t.next;
        }

    }
}
