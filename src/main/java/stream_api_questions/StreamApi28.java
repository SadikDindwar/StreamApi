package stream_api_questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

// Sort a Map by its values in descending order using Stream API.
public class StreamApi28 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "apple", 5,
                "banana", 2,
                "mango", 8,
                "orange", 3
        );
        Map<String, Integer> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,              // key mapper
                        Map.Entry::getValue,            // value mapper
                        (e1, e2) -> e1,                 // merge function (Needed in case of duplicates)
                        LinkedHashMap::new              // storing in LInkedHashMap to keep order of insertion
                ));
        System.out.println(sortedMap);


    }
}
