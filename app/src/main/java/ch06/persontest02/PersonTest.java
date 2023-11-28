package ch06.persontest02;

public class PersonTest {
    public static void main(String[] args) {
        Person[] persons = {
        new Person("길동이", 22), 
        new Student("황진이", 23, 100), 
        new ForeignStudent("Amy", 30, 200, "U.S.A")
        };

        for (Person person : persons) {
            System.out.println(person.show());
        }
    }
}
