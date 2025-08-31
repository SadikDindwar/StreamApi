package stream_api_questions;

import java.util.List;
import java.util.stream.Collectors;

// Find common elements from two lists using Stream API.
public class StreamApi30 {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> list2 = List.of(5, 6, 7, 8, 9, 10, 11);

        List<Integer> common = list1.stream()
                .filter(list2::contains)  // Keep only elements that are also in list2
                .distinct()               // Optional: remove duplicates
                .toList();

        System.out.println("Common elements: " + common);
    }
}
