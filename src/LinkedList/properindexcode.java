package LinkedList;

public class properindexcode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail= null;
        void insertatend(int data){
            Node temp = new Node(data);
            if (head == null) {
                head=temp;
            }else{
                tail.next = temp;
            }
            tail= temp;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void inserthead( int data){
            Node temp = new Node(data);
            if(head==null){
                head = tail =temp;
            }else{
                temp.next =head;
                head = temp;
            }
        }
        void insertatindex(int index,int num){
            Node t = new Node(num);
            Node temp = head;
            if(index>=size()){
                insertatend(num);
                return;
            }
            for(int i=0;i<index-1;i++){
                temp =temp.next;
            }
            t.next =temp.next;
            temp.next =t;
        }
        int size(){
            int count =0;
            Node temp =head;
            while(temp!=null){
                count++;
                temp= temp.next;
            }
            System.out.print(count+" ");
            return count;
        }
        void delet(int index){

            if(index ==0 ){
                head = head.next;
                return;
            }
            Node temp= head;
            for(int i=1;i<=index-1;i++){
                temp = temp.next;
            }
            temp.next =temp.next.next;
            tail= temp;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertatend(1);
        ll.insertatend(2);
        ll.insertatend(3);
        ll.insertatend(4);
        System.out.println("Original Linkedlist: ");
        ll.display();
        System.out.println();
        System.out.println("Delete Index Linkedlist: ");
        ll.delet(4);
        ll.display();
    }
}
