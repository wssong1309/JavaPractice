package ch07.practice06;

public class Student implements Human {
    private int age;

    // Constructor
    public Student(int age) {
        this.age = age;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    public void print() {
        System.out.println(age + "세의 학생입니다.");
    }
}
