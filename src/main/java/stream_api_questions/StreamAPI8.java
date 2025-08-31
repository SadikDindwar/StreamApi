package stream_api_questions;


import java.util.List;
import java.util.stream.Collectors;

//Add all Strings in the list with a coma separating them using Stream Api.


public class StreamAPI8 {
    public static void main(String[] args) {
        List<String > list = List.of("Hello" , "how " , "Are" , "you" , "doing");
        String str = list.stream().collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
