public class DeleteElementLL {

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
  public void delete(int data){
         Node temp= head , prev=null;
         if(temp!= null && temp.data == data){
            head= temp.next;
            return;
         }
         while(temp!= null && temp.data != data ){
            prev=temp;
            temp=temp.next;

         }
         if(temp==null){
            return;
         }
         if(temp== tail){
           tail=prev;
            tail.next=null;
         }
         prev.next=temp.next;
  }

    public static void main(String[] args){
        DeleteElementLL list =new DeleteElementLL();
     
      list.addNode(10);
      list.addNode(40);
      list.addNode(50);
      
    //   list.display();
      list.delete(50);
      list.display();

    }
    
}
