package stream_api_questions;

//Write a program to print the unique numbers from the given list using Stream Api.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 7, 8, 75, 4, 12, 45, 85, 41, 75, 987, 14, 2, 45, 4, 12, 4, 54, 85);
        // first finding the frequency of each number
        Map<Integer , Long> frequency = list.stream().collect(Collectors.groupingBy(num -> num , Collectors.counting()));

        //finding the numbers whose frequency is exactly 1

        List<Integer> result = frequency.entrySet().stream().filter(entry -> entry.getValue() ==1).map(Map.Entry::getKey).toList();
        // here toList() can be directly used instead of writing collect(Collectors.toList()) only when we are using java 16 or above.
        System.out.println("Unique Numbers : " +result);


    }
}
