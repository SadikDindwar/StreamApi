package stream_api_questions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group a list of Person objects by age using Stream API.
public class StreamApi16 {
    public static void main(String[] args) {
        List<Person2> list = List.of(new Person2("sadik" , 24 , 480000) , new Person2("ravi" , 25 , 500000), new Person2("Shivani" ,27, 564321) , new Person2("Ajay" ,25 , 8976543));
        // this will group the ages only
        Map<Integer , Long> result = list.stream()
                .collect(Collectors.groupingBy(entry ->entry.getAge(), Collectors.counting())  );
        System.out.println(result);

        //Group a list of Person objects by age using Stream API.
        Map<Integer, List<Person2>> groupedByAge = list.stream()
                .collect(Collectors.groupingBy(Person2::getAge));
        System.out.println(groupedByAge);

    }
}

class Person2{
    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person2(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
