package general_coding_questions;

import java.util.ArrayList;
import java.util.List;

public class Code1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=100; i++){
            if(isPrime(i)){
                list.add(i);
            }
        }

        System.out.println(list);
    }
    public static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return  false;
        }
        boolean b = true;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i ==0){
                b = false;
                break;
            }
        }
        return b;
    }
}
