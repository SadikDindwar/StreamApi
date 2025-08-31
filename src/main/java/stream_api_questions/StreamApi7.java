package stream_api_questions;


//Average of the list using Stream Api


import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class StreamApi7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,7,8,75,4,12,45,85,41,75,987,14,2,45,4,12,4,54,85);

        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();

        if( average.isPresent()){
            System.out.println(average.getAsDouble());
        }
        else{
            System.out.println("Null");
        }
    }
}

/* Note:
 average() method is not available directly on Stream<Integer>.
 It is only available on a primitive stream like IntStream, DoubleStream, or LongStream.
 */
