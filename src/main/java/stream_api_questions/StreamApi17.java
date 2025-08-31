package stream_api_questions;

// Sort a list of Employee objects by salary in descending order.

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi17 {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee(1 , "sadik" , 50000000) , new Employee(2 , "ajay", 6000000), new Employee(3,"priya" ,500000),new Employee(4, "Manoj" ,700000));
        List<Employee> descendingResult = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).toList();
        System.out.println(descendingResult);

        //in descending order
        List<Employee> ascendingResult = list.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(ascendingResult);
    }
}

class Employee{
    private int id;
    private String name;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
