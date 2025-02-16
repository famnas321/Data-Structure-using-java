
public class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
    }
  public Node head=null;
  public Node tail=null;

  public void addNode(int data ){
    Node newNode =new Node(data);
    if (head==null){
        head=newNode;
        
    }else{
    tail.next=newNode;
    }
    tail=newNode;

  }
  public void display(){
    if(head == null){
      System.out.print("head is empty");
      return;
    }
    Node temp= head;
    while(temp !=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
  }

    public static void main(String[] args){
      LinkedList list =new LinkedList();
     
      list.addNode(10);
      list.addNode(40);
      list.addNode(50);
      list.display();

    }
}
