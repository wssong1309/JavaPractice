package ch06.persontest02;

public class Person {
    private String name;
    private int age;
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Getter() / Setter() methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String show() {
        return "사람 [이름 : " + name + ", 나이 : " + age + "]";
    }
    // @Override
    // public String toString() {
    //     return "Person [name=" + name + ", age=" + age + "]";
    // }
}
