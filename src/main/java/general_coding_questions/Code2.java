package general_coding_questions;
// Given a Array of integers and the number K.Find the smallest sub array when added becomes K.
public class Code2 {
    public static void main(String[] args) {
   int [] arr = {1,4,8,7,5,2,6,9,4,12};
   int k = 13;
   int minLength = Integer.MAX_VALUE;
   int sum = 0;
   int start = 0;
   for(int end=0; end<arr.length; end++){
       sum += arr[end];

       while(sum >=k){
           if(sum ==k){
               minLength = Math.min(minLength , end-start+1);
           }
           sum -= arr[start];
           start++;
       }
   }
   if(minLength == Integer.MAX_VALUE){
       System.out.println("No sub array found");
   }
   
   else{
       System.out.println("The minimum sub array length is : "+ minLength);
   }

    }
}
