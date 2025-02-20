public class InsertBack {
  class Node{
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
    if(head==null){
       head=newNode;

    }else{
        tail.next=newNode;
        newNode.prev=tail;
    }
    tail=newNode;
 }
 public void display(){
    Node temp=head;
    while(temp != null ){
        System.out.println(temp.data);
        temp=temp.next;
    }
 }
 public void  insertIntoBack(int data, int prevTo){
    Node newNode =new Node(data);
    Node temp= head;
    if(temp != null && temp.data == prevTo)
    {
        temp.prev= newNode;
        newNode.next= temp;
        head=newNode;
        return;
    }
    while (temp != null && temp.data != prevTo) {
        temp= temp.next;
    }
    newNode.next=temp;
    newNode.prev=temp.prev;
    temp.prev.next=newNode;
    temp.prev=newNode;
    
 }
 public static void main(String[] args) {
    InsertBack list =new InsertBack();
    list.addNode(20);
    list.addNode(30);
    list.addNode(40);
    list.insertIntoBack(35, 20);
    list.display();
 }

    
}
