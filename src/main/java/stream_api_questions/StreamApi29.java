package stream_api_questions;

import java.util.ArrayList;
import java.util.List;

// Remove null and blank strings from a list using Stream API.
public class StreamApi29 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("");
        list.add("four");
        list.add("five");
        list.add(null);
        list.add("six");
        list.add("seven");
        list.add("");
        list.add("nine");
        list.add("ten");
        List<String> result =list.stream()
                .filter(a -> a != null && !a.trim().isEmpty())
                .toList();
        System.out.println(result);

    }
}
