package stream_api_questions;


//Convert List of Strings to upper case using Stream Api.


import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI3 {
    public static void main(String[] args) {
        List<String> list = List.of("hello" , "world" , "hi","Bye" , "ok");
        List<String> result = list.stream().map(String :: toUpperCase).collect(Collectors.toList());
        System.out.println(result);
    }
}
