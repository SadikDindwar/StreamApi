package stream_api_questions;

//From List of Person extract there age and store it in a list suing Stream Api.

import java.util.List;
import java.util.stream.Collectors;

public class StreamApi15 {
    public static void main(String[] args) {
        List<Person> personList = List.of(new Person("arjun" , 12,"male") , new Person("sadik" , 24 , "male"), new Person("rajiv" , 56 , "male"), new Person("Shivani" , 45 , "female"));
        List<Integer> ages = personList.stream().map(Person::getAge).toList();
        System.out.println(ages);
        System.out.println(personList);


    }
}

//Person class
class Person{
    private  String name;
    private int age;
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
