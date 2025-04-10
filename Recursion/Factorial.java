public class Factorial{
   public static int findFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*findFactorial( n-1);
   }
   public static void main(String[] args) {
     int number=5;
     int result= findFactorial(number);
     System.out.println(result);
   }
}