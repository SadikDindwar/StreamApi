package stream_api_questions;

import java.util.List;
import java.util.Optional;


// Find max and min element in the list using Stream Api.

public class StreamAPI1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12,45,85,41,75,987,14,2,45,4,12,4,54,85);
        Optional<Integer> result = list.stream().max(Integer::compare);
        result.ifPresent(System.out::println);
        Optional<Integer> min = list.stream().min(Integer::compare);
        min.ifPresent(System.out::println);
    }
}
