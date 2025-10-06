package stream_api_questions;

// Important Conversions.

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamApi34 {
    public static void main(String[] args) {

        //1. Converting int array to stream of Integer or int arr[] to Stream<Integer>

        int [] arr = {1,2,5,45,78,65,54};
        Stream<Integer> integerStream = Arrays.stream(arr).boxed();

        integerStream.forEach(System.out::println);

        //2. Converting char array to stream of Character or char arr[] to Stream<Character>

        Character charArray [] ={'a', 'u', 'o','e'};
        Stream<Character> charStream = Arrays.stream(charArray);
        charStream.forEach(System.out::println);

        //3. String to stream of Character or String to Stream<Character>

        String str = "hello world";
        Stream<Character> charStream2 = str.chars() // returns an IntStream of unicode
                .mapToObj(c -> (char)c); // map each unicode to a character.
        charStream2.forEach(System.out::println);

        //4. Converting String array into Stream<Stream> or String []arr to Stream<String>

        String arr2[] = {"hello" , "world" , "programming" ,"hi"};
        Stream<String> stringStream = Arrays.stream(arr2);
        stringStream.forEach(System.out::println);



    }
}
