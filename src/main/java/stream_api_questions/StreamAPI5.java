package stream_api_questions;


//sort the list in descending order using Stream Api


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,75,4,12,45,85,41,75,987,14,2,45,4,12,4,54,85);
        List<Integer> result = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(result);
    }
}
