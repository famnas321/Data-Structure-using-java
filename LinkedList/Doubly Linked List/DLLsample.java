

public class DLLsample {
    class Node{
        int data;
        Node next;
        Node prev;
         Node (int data){
            this.data=data;

         }

    }
    public Node head;
    public Node tail;

    public void addNode(int data){
       Node newNode = new Node(data);
       
       if(head==null){
        head=newNode;
       }
       else{
        tail.next=newNode;
        newNode.prev=tail;
       }
       tail=newNode;

      
    }
    public void display(){
        Node temp=head;
        while (temp!=null) {
          System.out.println(temp.data);
          temp= temp.next;          
        }
    }
    public static void main(String[] args) {
        DLLsample list = new DLLsample();
        list.addNode(3);
        list.addNode(5);
        list.addNode(4);
        list.display();

    }
}
