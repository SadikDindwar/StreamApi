package stream_api_questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Return elements that appear only once in a list of strings.
public class StreamApi22 {
    public static void main(String[] args) {
        List<String> list = List.of("sadik" , "hi" , "hello" , "world" , "bangalore", "hi" , "world");
        List<String> result=list.stream().collect(Collectors.groupingBy(entry -> entry , Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(result);

    }
}
