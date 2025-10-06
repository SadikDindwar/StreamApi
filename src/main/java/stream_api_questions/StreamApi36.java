package stream_api_questions;

// Give a list of String group the String based on there first character using Stream Api.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi36 {
    public static void main(String[] arg){
        List<String> list = Arrays.asList("apple" , "yellow" , "arrow" , "orange" , "red" , "oxygen" , "rain");
        Map<Character , List<String>> result = list.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0)));

        System.out.println(result);
                //or print Same using  below
        result.forEach((key , value)->{
            System.out.println(key +" : "+ value);
        });

    }
}
