public class Palindrome{
   public static boolean checkPalindrome(String str, int start, int end){
    if (start >=end){
        return true;

    }
    if(str.charAt(start) != str.charAt(end)){
        return false;

    }
    return checkPalindrome(str, start+1 ,end-1);

   }
   public static void main(String[] args) {
       String  input ="level";
       boolean result= checkPalindrome(input, 0, input.length()-1);
      if(result){
        System.out.println(input +" is palindrome");
      }
      else{
        System.out.println(input +"is not palindrome");
      }
   }
}