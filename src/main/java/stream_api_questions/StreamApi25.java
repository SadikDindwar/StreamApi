package stream_api_questions;
//Find kth - highest number from the given list of integers.

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StreamApi25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter K value : ");
        int k = sc. nextInt();

        List<Integer> list = List.of(17,8,5,69,12,45,57,10,1,25);
        if(k <= list.size() && k > 0) {
            Optional<Integer> result = list.stream()
                    .sorted(Comparator.reverseOrder())
                    .skip(k-1)
                    .findFirst();
            result.ifPresent(System.out::println);
        }
        else{
            System.out.println("K value should not be greater than size of the list.");
        }
    }
}
