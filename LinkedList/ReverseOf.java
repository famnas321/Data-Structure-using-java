public class ReverseOf {
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;

        }else{
            tail.next =newNode;
        }
        tail=newNode;
    }
    public void display(){
        Node temp=head;
        while(temp != null)  {
            System.out.println(temp.data);
            temp=temp.next;
        }   

    }
    public Node  reverce(){
        Node current =head;
        Node following = head;
        Node prev=null;

        while( current !=null){
            following=following.next;
            current.next=prev;
            prev=current;
            current=following;
          
            
        
        }
        
        head=prev;
        return head;
       
        
    }

    public static void main(String[] args) {
        ReverseOf list= new ReverseOf();
        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);
        
         list.reverce();
         list.display();
        
    }
    
}
