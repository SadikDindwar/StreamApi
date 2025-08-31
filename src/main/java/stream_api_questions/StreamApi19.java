package stream_api_questions;

//Partition a list of integers into even and odd numbers using partitioningBy.

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamApi19 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,5,5,8,7,5,4,6,2,4,7,8,98,45,21,548,147,584,654,985,777,12);
        Map<Boolean , List<Integer>> result = list.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 ==0));

        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        if(in.equalsIgnoreCase("even")){
            System.out.println("Even list : "+ result.get(true));

        }
        else{
            System.out.println("Odd list :" + result.get(false));
        }
        run(sc);

    }

    //partition of employees as male and female
    public static void run(Scanner sc){
        List<Person> list = List.of(new Person("arjun" , 12,"male") , new Person("sadik" , 24 , "male"), new Person("rajiv" , 56 , "male"), new Person("Shivani" , 45 , "female"));
        Map<Boolean , List<Person>> result = list.stream().collect(Collectors.partitioningBy(person ->  person.getGender().equalsIgnoreCase("male")));
        String gender = sc.nextLine();
        if(gender.equalsIgnoreCase("male")){
            System.out.println(result.get(true));
        }
        else{
            System.out.println(result.get(false));
        }

    }
}
