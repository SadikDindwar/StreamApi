package stream_api_questions;


//Given an array of integers and an integer k, return the k most frequent elements in the array using Stream Api.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI33 {
    public static void main(String[] args) {
        int [] arr = {54,84,7,4,21,64,84,50,84,54,84,21,4,84,54,84,96,78,41,52,84,21,78,54,84,7,21};
        int k = 3;
        List<Integer> res = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(a -> a , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed()) // sorting in reverse order
                .limit(k)                          // limiting k most frequent element
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(res);


        //Second most frequency number
        List<Integer> numbers = Arrays.asList(5, 12, 19, 5, 7, 12, 5, 19, 20, 20, 20);
        List<Integer> secondMost = numbers.stream()
                .collect(Collectors.groupingBy(a->a , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Long>comparingByValue().reversed())
                .skip(1)
                .limit(1)
                .map(Map.Entry::getKey)
                .toList();

    }
}
