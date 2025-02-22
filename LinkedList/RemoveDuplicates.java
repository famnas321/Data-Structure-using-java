public class RemoveDuplicates {
    
    class Node{
        int data;
        Node next;

        Node (int data){
            this.data= data;
        }
    }
    public Node head;
    public Node tail;
   
    public void addnode(int data){
        Node newNode= new Node(data);
        if(head == null){
            head = newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }
    public void display(){
        Node temp= head;
        while(temp !=null){
        System.out.println(temp.data);
        temp=temp.next;
        
         }
    }
    public void removeDup(){
        Node current= head;
        while(current != null){
            Node next= current.next;
            while(next != null && next.data ==current.data){
                next= next.next;
            }
            current.next= next;
            if(next == tail && current.data == next.data){
                tail=current;
                tail.next= null;
            }
            current= next;
        }

    }
    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.addnode(6);
        list.addnode(8);
        list.addnode(8);
        list.addnode(8);
        list.addnode(9);
        list.addnode(9);
        list.removeDup();
        list.display();
    }

}