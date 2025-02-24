public class Push {
    
 
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data= data;
            }
        }
      public Node top=null;
      
    
      public void pushing(int data ){
        Node newNode =new Node(data);
        if (top==null){
            top=newNode;
            
        }else{
        newNode.next=top;
        top=newNode;
        }
        
    
      }
      public void pop(){
        if(top==null){
            System.out.println("Stack underflow");
        }
        top=top.next;
      }
      public void display(){
        Node temp= top;
        if(temp == null){
          System.out.print("Stack is empty");
          return;
        }
       
        while(temp !=null){
          System.out.println(temp.data);
          temp=temp.next;
        }
      }
      
    
        public static void main(String[] args){
           Push list =new Push();
         
          list.pushing(10);
          list.pushing(40);
          list.pushing(50);
         list.pop();
          
          
          list.display();
    
        }
    }
    

