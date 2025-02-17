public class InsertionLL {
 
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
  public void insert( int nextTo, int data){
    Node newNode= new Node(data);
    Node temp=head;

    while(temp!=null && temp.data != nextTo){
       temp=temp.next;
    }
    if(temp== null){
        return;

    }
    if(temp== tail){
        tail.next=newNode;
        tail=newNode;

    
    }
    newNode.next=temp.next;
    temp.next=newNode;
  }

    public static void main(String[] args){
        InsertionLL list =new InsertionLL();
     
      list.addNode(10);
      list.addNode(40);
      list.addNode(50);

      
      list.insert(40, 90);
      list.display();

    }
}
