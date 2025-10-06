package stream_api_questions;


import java.util.*;
import java.util.stream.Collectors;

//Given a String find the most occurring vowel in a given String using Stream Api.
public class StreamApi35 {

    public static void main(String[] args) {
        String str = "prograaaaammiing";
        List<Character> vowels = Arrays.asList('a', 'e', 'i' , 'o' , 'u');

       Optional<Map.Entry<Character, Long>> result =  str.chars().mapToObj(c -> (char)c)
                .filter(item -> vowels.contains(item))
                .collect(Collectors.groupingBy(a ->a, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder()))
                .findFirst();

       result.ifPresent(entry -> {
           System.out.println("The most occurring vowel in a given String is "+entry.getKey() +" :"+entry.getValue());
       });

    }
}
