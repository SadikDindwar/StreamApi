package stream_api_questions;

import java.util.List;

// Check if all elements in a list match a condition (e.g., all even).
public class StreamApi23 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,2,4,8,98,52,40);
        List<Integer> evenList = list.stream()
                .filter(num -> num%2==0)
                .toList();
        if(list.size() == evenList.size()){
            System.out.println("All numbers are even.");
        }
        else{
            System.out.println("All numbers are not even.");
        }

        //The above problem can be solved in most easy and efficient way :

        boolean isTrue = list.stream()
                .allMatch(a -> a%2==0);
        if(isTrue){
            System.out.println("All numbers are even. or all numbers follow the condition");
        }
        else{
            System.out.println("All numbers are not even. or all numbers don't follow the condition.");
        }
    }
}
