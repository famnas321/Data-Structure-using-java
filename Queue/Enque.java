package Queue;


public class Enque {
     
      class Node{
            int data;
            Node next;
            Node(int data){
                this.data= data;
            }
        }
      public Node front;
      public Node rear;
      
    
      public void enqueue(int data ){
        Node newNode =new Node(data);
        if (rear==null){
            front=rear=newNode;
            
        }else{
        rear.next=newNode;
        rear= newNode;
        }
        
    
      }
      public void dequeue(){
        if(front==null){
            System.out.println("queue is empty");
        }
        front=front.next;
        rear=null;
        
      }
      public void display(){
        Node temp=front;
        if(temp == null){
          System.out.print("Que is empty");
          return;
        }
       
        while(temp !=null){
          System.out.println(temp.data);
          temp=temp.next;
        }
      }
      
    
        public static void main(String[] args){
            Enque list =new Enque();
         
          list.enqueue(10);
          list.enqueue(40);
          list.enqueue(50);
         list.dequeue();
          
          
          list.display();
    
        }
}
