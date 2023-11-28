package ch06.phonetest05;

public class Telephone extends Phone{
    private String when;
    Telephone(String owner, String when) {
        super(owner);
        this.when = when;
    }
    void autoAnswering() {
        System.out.println(owner + "님이 부재중입니다." + when + " 다시 전화주세요.");
    }
}
