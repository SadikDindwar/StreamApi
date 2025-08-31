package stream_api_questions;

import java.util.Comparator;
import java.util.List;

//Get names of top 3 highest-paid employees from a list.

public class StreamApi18 {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee(1 , "sadik" , 50000000) , new Employee(2 , "ajay", 6000000), new Employee(3,"priya" ,500000),new Employee(4, "Manoj" ,700000));
        List<String> result = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .map(Employee::getName)
                .toList();
        System.out.println(result);
    }
}
