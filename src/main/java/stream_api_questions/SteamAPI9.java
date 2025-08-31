package stream_api_questions;

//write a program to find the frequency of each numbers in a list using Stream Api.

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SteamAPI9 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 5, 7, 8, 75, 4, 12, 45, 85, 41, 75, 987, 14, 2, 45, 4, 12, 4, 54, 85);
        Map<Integer , Long> result = list.stream().collect(Collectors.groupingBy(num -> num , Collectors.counting()));
        System.out.println(result);

    }
}
