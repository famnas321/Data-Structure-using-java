public class MovetoEnd {
    public static int[] moveElement(int[] array ,int elementTomove){
      int n= array.length;
      int [] result=array.clone();
      int temp;
      int left=0;
      int right=n-1;
      while (left<right  )  {
        if (result[left]==elementTomove && result[right]!=elementTomove) {
            temp=result[right];
            result[right]=result[left];
            result[left]=temp;
            left++;
            right--;


        }else if (result[right]==elementTomove){
            right--;

        }else{
            left++;
        }
      }
      return result;
    }

    public static void main(String args[]){
        int [] array= { 6,1,6,8,10,4,15,3,9,6};

        int elementTomove=6;
        int [] result=moveElement(array,elementTomove);
        for(int i=0; i<=result.length-1;i++){
            System.out.println(result[i]);
        }

    }
    
}
