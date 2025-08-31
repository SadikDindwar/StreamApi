package stream_api_questions;

// Flatten a list of lists using flatMap and collect the result.

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi20 {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(List.of(1,2,3,4), List.of(5,6,7), List.of(8,9,89));
        System.out.println(list);

        List<Integer> flattenList = list.stream().flatMap(innerList -> innerList.stream()).toList();
        System.out.println(flattenList);


    }
}
