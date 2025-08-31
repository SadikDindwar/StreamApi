package stream_api_questions;
//Find the Second highest salary of the Employees.

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApi24 {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee(1 , "sadik" , 50000000) , new Employee(2 , "ajay", 6000000), new Employee(3,"priya" ,500000),new Employee(4, "Manoj" ,700000));
        Optional<Integer> secondHighestSalary = list.stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighestSalary.ifPresent(System.out::println);


        //If asked to find second - highest salaried Employee Object.

        Optional<Employee> secondHighestSalaryEmployee = list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        secondHighestSalaryEmployee.ifPresent(System.out::println);
    }
}
