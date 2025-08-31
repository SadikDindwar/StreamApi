package stream_api_questions;


//Find numbers that occur more than once in a list.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi14 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 7, 8, 75, 4, 12, 45, 85, 41, 75, 987, 14, 2, 45, 4, 12, 4, 54, 85);
        List<Integer> result =list.stream()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue()>1)
                .map(Map.Entry::getKey).toList();
        System.out.println(result);
    }
}

/* Explanation
This means:

First, group numbers by themselves and count how often they appear (Map<Integer, Long>)

Then filter entries with count > 1 (i.e., duplicates)

Then map to just the key (the number itself)

And collect them into a list
 */
