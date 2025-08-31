package stream_api_questions;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count the frequency of each character in a string using Stream API
public class StreamApi31 {
    public static void main(String[] args) {
        String input = "streamapi";

        Map<Character, Long> frequencyMap = input.chars() // IntStream of characters
                .mapToObj(c -> (char) c) // Convert int to char
                .collect(Collectors.groupingBy(
                        Function.identity(), // group by the character itself
                        Collectors.counting() // count occurrences
                ));

        System.out.println("Character Frequencies: " + frequencyMap);
    }
}
