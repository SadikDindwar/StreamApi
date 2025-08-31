package stream_api_questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Write a program to print  the duplicates from the list using Stream Api.

public class StreamApi11{
    public static void main(String [] args){
        List<Integer> list = List.of(1,2,5,7,8,75,4,12,45,85,41,75,987,14,2,45,4,12,4,54,85);
        List<Integer> result = list.stream().collect(Collectors.groupingBy(num -> num , Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() >1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(result);

    }
}
/* Explain
first im converting the integer list to HashMap and storing numbers as a key and value as the frequency of the numbers
and then again im applying stream on that to filter the elements whose frequency is more than one.
and im using map to get the key from the filtered data and storing those keys in a list.
*/