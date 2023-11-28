package ch06.persontest02;

public class ForeignStudent extends Student{
    private String nation;
    public ForeignStudent(String name, int age, int stnum, String nation) {
        super(name, age, stnum);
        this.nation = nation;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String show() {
        return "외국학생 [이름 : " + getName() + ", 나이 : " + getAge() + ", 학번 : " + getStnum() + ", 국적 : " + nation + "]";
    }
}
