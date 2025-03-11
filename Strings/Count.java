

public class Count {
    public static  String  counting(String str){
          int count = 1;
          String newString = "";
        
         
          for ( int i =1 ;i<str.length(); i++){

            
             if(str.charAt(i)==str.charAt(i-1)){
                count++;
                
                
             }else{
               
                newString= newString + Integer.toString(count) + str.charAt(i-1);
                count =1;
                
                
             }
             newString= newString + Integer.toString(count) + str.charAt(i-1);
               
          } 
          return newString;
       
    }
    public static void main(String[] args) {
       String Data ="abbcc";
       System.out.println(counting(Data));
    }
}
 