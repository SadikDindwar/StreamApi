package stream_api_questions;

import java.util.List;
import java.util.stream.Collectors;

// Convert a list of integers to a single string separated by -, excluding duplicates.
public class StreamApi27 {
    public static void main(String[] args) {
        List<Integer> list = List.of(17,8,5,69,12,45,57,10,1,25,78,45,78,96,41,45,782,12,45,54,63,45,85,12);
        String result = list.stream()
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining("-"));
        System.out.println(result);
    }
}
