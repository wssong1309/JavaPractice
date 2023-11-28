package ch06.persontest02;

public class Student extends Person{
    private int stnum;
    public Student(String name, int age, int stnum) {
        super(name, age);
        this.stnum = stnum;
    }
    public int getStnum() {
        return stnum;
    }
    public void setStnum(int stnum) {
        this.stnum = stnum;
    }
    public String show() {
        return "학생 [이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + stnum + "]";
    }
}
