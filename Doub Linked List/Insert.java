public class Insert {
    class Node {
       int data;
       Node next;
       Node prev;
       Node (int data){
        this.data= data;
       }
      }
      public Node head;
      public Node tail;
      
      public void addNode(int data){
         Node newNode = new Node(data);
         if(head== null){
            head=newNode;
         }else{
            tail.next=newNode;
            newNode.prev=tail;
         }
         tail=newNode;
      }
      public void display(){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.data);
            temp= temp.next;
        }
      }

      public void insertNode(int data ,int nextTo){
        Node newNode = new Node(data);
        Node temp=head;
        if(temp != null && temp.data==nextTo ){
            newNode.next= head;
            head.prev=newNode;
            head= newNode;
             return;
        }
        while(temp != null && temp.data != nextTo){
            temp= temp.next;
        }
        if(temp == tail){
            temp.next=newNode ;
            newNode.prev=temp;
            tail=newNode;
            return;
        }
        // newNode.next=temp.next;
        // newNode.prev=temp;
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
        


      }
      public static void main(String[] args) {
        Insert list = new Insert();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.insertNode(25, 10);
        list.display();
      }

}
