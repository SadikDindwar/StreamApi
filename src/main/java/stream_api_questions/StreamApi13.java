package stream_api_questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Group elements by frequency using groupingBy and counting using Stream Api.
public class StreamApi13 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 7, 8, 75, 4, 12, 45, 85, 41, 75, 987, 14, 2, 45, 4, 12, 4, 54, 85);
        Map<Integer , Long> result = list.stream()
                .collect(Collectors.groupingBy(num -> num , Collectors.counting()));
        System.out.println(result);

        //if we want to sort in descending order based on frequency:
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));

        System.out.println("#####################################################################################################");

        //if we want to sort in ascending order based on frequency:
        result.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + " => " + e.getValue()));
    }
}
