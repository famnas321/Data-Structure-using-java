

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
        }
    }
    public static void main(String[] args) {
        Delete list =new Delete();
        list.addNode(30); 
        list.addNode(40); 
        list.addNode(60); 
        list.addNode(80); 
        list.display();
    }
}
