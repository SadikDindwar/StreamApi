package stream_api_questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// Find the most frequent element in a list.
public class StreamApi26 {
    public static void main(String[] args) {
        List<Integer> list = List.of(17,8,5,69,12,45,57,10,1,25,78,45,78,96,41,45,782,12,45,54,63,45,85,12);
        Optional<Integer> result= list.stream()
                .collect(Collectors.groupingBy(num ->num , Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Integer , Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .findFirst();
        result.ifPresent(System.out::println);
    }
}
