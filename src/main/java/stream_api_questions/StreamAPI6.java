package stream_api_questions;

import java.util.List;
import java.util.stream.Collectors;


//Remove duplicates using Stream Api


public class StreamAPI6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,75,4,12,45,85,41,75,987,14,2,45,4,12,4,54,85);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);

        // or call method below

        new StreamAPI6().removeDuplicates(list);
    }

    public void removeDuplicates(List<Integer> list){
        list.stream().distinct().forEach(System.out::println);
    }
}
