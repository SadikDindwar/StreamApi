package stream_api_questions;

//Find the longest string in a list using Stream API.

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApi21 {
    public static void main(String[] args) {
        List<String> list = List.of("acbhcb" , "cdfd" , "dcfff" ,"Longest_String");
        Optional<String > largestString = list.stream().max(Comparator.comparing(String::length));
        largestString.ifPresent(System.out::println);


        //Find the smallest String in a list using Stream Api

        Optional<String> smallestString = list
                .stream()
                .min(Comparator.comparing(String::length));
        smallestString.ifPresent(System.out::println);

    }
}
