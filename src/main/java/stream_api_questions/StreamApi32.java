package stream_api_questions;


//Find sum of the integers in the list using Stream Api.

import java.util.List;
import java.util.Optional;

public class StreamApi32 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,6);
        Optional<Integer> result = list.stream().reduce((a, b) -> a+b);
        result.ifPresent(System.out::println);

        //or
        Integer res = result.stream().mapToInt(Integer::intValue).sum();
        System.out.println(res);

    }
}
