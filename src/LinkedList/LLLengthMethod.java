package LinkedList;

public class LLLengthMethod {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public static void LinkedlistLength(Node h){
        int count = 0;
        Node temp = h;

        while(temp!=null){
            count++;
            temp = temp.next;

        }
        System.out.println("LINKEDLIST length: "+count);
    }
    public static void main(String[] args) {

        Node a= new Node(4);
        Node b= new Node(4);
        Node c= new Node(4);
        Node d= new Node(4);
        Node e= new Node(4);
        a.next =b;
        b.next = c;
        c.next =d;
        d.next =e;
        LinkedlistLength(a);

    }
}
