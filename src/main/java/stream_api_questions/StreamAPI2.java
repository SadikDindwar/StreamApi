package stream_api_questions;


import java.util.List;
import java.util.Optional;

// Count numbers greater than 10 in a list using Stream Api
public class StreamAPI2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,75,4,12,45,85,41,75,987,14,2,45,4,12,4,54,85);
        Long result = list.stream().filter(a -> a>10).count();
        System.out.println(result);
    }

}
