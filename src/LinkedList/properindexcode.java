package LinkedList;

public class properindexcode {
    public class inserthead{
        public static class Node{
            int val;
            LinkedList.inserthead.Node next;

            Node(int val){
                this.val=val;
            }
        }
        public static class linkedlist{
            LinkedList.inserthead.Node head = null;
            LinkedList.inserthead.Node tail = null;
            void insertatend(int val){
                LinkedList.inserthead.Node temp = new LinkedList.inserthead.Node(val);
                if(head == null){
                    head = temp;
                }
                else{
                    tail.next=temp;
                }
                tail = temp;
            }
            void display(){
                LinkedList.inserthead.Node temp = head;
                while(temp!=null){
                    System.out.print(temp.val+" ");
                    temp= temp.next;
                }
            }
            void insertathead(int val){
                LinkedList.inserthead.Node temp = new LinkedList.inserthead.Node(val);

                if(head== null){
                    temp = head = tail;
                }else{
                    temp.next=head;
                    head = temp;
                }

            }
            void insertarindex(int index,int num){
                LinkedList.inserthead.Node t= new LinkedList.inserthead.Node(num);
                LinkedList.inserthead.Node temp = head;
                if(index==0){
                    insertathead(num);
                    return;
                }
                if(index>=size()){
                    insertatend(num);
                    return;
                }
                for(int i=0;i<index-1;i++){
                    temp=temp.next;
                }
                t.next = temp.next;
                temp.next=t;
            }
            int size(){
                int count=0;
                LinkedList.inserthead.Node temp = head;
                while(temp!=null){
                    count++;
                    temp= temp.next;
                }
                System.out.println(count+" ");
                return count;
            }

        }
        public static void main(String[] args) {
            LinkedList.inserthead.linkedlist ll = new LinkedList.inserthead.linkedlist();
            ll.insertatend(1);
            ll.insertatend(2);
            ll.insertatend(3);
            ll.insertatend(4);
            ll.insertatend(5);
            ll.display();
            System.out.println();
            ll.insertarindex(5,55);
            ll.display();
            System.out.println();
//        System.out.println(ll.tail.val);
//        ll.size();
            ll.insertarindex(0,666);
            ll.display();
            ll.insertarindex(8,666);
            ll.display();
        }
    }
}
