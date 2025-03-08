 public class StringEncrypt {
   public static String change(String str, int key){
     int newKey = key %26;
     char [] newCharArray = new char[str.length()];
     for (int i =0;i<str.length();i++){
        int letterposition = str.charAt(i) +newKey;
        if(letterposition<= 122){
            newCharArray[i]= (char) letterposition;

        }else{
            newCharArray[i]=(char) (96+letterposition%122);
        }
    }
    return new  String(newCharArray); 
   }
    public static void main(String[] args) {
        String value = "abc";
        System.out.println(change(value, 2));
    }
}