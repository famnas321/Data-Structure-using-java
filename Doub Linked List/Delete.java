

public class Delete {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data= data;
        }
       
        
    }
    public Node head;
    public Node tail;
    
    public void addNode(int data){
        Node newNode =new Node(data);
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
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void delete(int data){
        Node temp=head;
        if(temp !=null && temp.data==data){
            head=temp.next;
            head.prev=null;
            return;
        }
     while(temp !=null && temp.data!=data){
        temp= temp.next;
     }
     if(temp == tail){
         tail=temp.prev;
         tail.next=null;
         return;
     }
     temp.prev.next=temp.next;
     temp.next.prev=temp.prev;
    }
    
    public static void main(String[] args) {
        Delete list =new Delete();
        list.addNode(30); 
        list.addNode(40); 
        list.addNode(60); 
        list.addNode(80); 
        list.delete(30);
        list.display();
        
    }
}
