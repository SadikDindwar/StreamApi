package stream_api_questions;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// from a given LIst Write a program  to store the numbers as a key and value as the square of that number using Stream Api.
public class StreamApi12 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,75,4,12,45,85,41,75,987,14,2,45,4,12,4,54,85);
        /*
        Map<Integer, ????> result = list.stream()
        .collect(Collectors.groupingBy(num -> num, num -> num * num)); // ❌ Invalid
        Invalid because groupingBy() second argument must be Collector and it should be a function.
         */

        //first the duplicates should be removed and then we should store this in Map
        Map<Integer, Integer> squareMap = list.stream().distinct()
                .collect(Collectors.toMap(
                        num -> num,        // key
                        num -> num * num // value

                ));
        System.out.println(squareMap);

        //But if we want to handle duplicates.
        Map<Integer, Integer> squareMap2 = list.stream()
                .collect(Collectors.toMap(
                        num -> num,        // key
                        num -> num * num,  // value
                        (oldVal, newVal) -> oldVal // handle duplicates
                ));
        System.out.println(squareMap2);

    }
}
