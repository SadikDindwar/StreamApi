package general_coding_questions;

import java.util.List;
import java.util.Optional;

public class Code3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,6);
        Optional<Integer> result = list.stream().reduce(Integer::sum);
        result.ifPresent(System.out::println);
    }

}
