package LinkedList;

public class inserthead{
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertatend(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else{
                tail.next=temp;
            }
            tail = temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp= temp.next;
            }
        }
        void insertathead(int val){
            Node temp = new Node(val);

            if(head== null){
                temp = head = tail;
            }else{
                temp.next=head;
                head = temp;
            }

        }
        void insertarindex(int index,int num){
            Node t= new Node(num);
            Node temp = head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            t.next = temp.next;
            temp.next=t;
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatend(1);
        ll.insertatend(2);
        ll.insertatend(3);
        ll.insertatend(4);
        ll.insertatend(5);
        ll.display();
        System.out.println();
        ll.insertathead(101);
        ll.insertathead(102);
        ll.insertathead(103);
        ll.display();
        System.out.println();
        ll.insertarindex(9,55);
        ll.display();
    }
}