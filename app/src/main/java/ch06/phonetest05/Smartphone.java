package ch06.phonetest05;

public class Smartphone extends Telephone{
    private String game;
    Smartphone(String owner, String game) {
        super(owner, "when");
        this.game = game;
    }
    void playGame() {
        System.out.println(owner + "님이 " + game + "게임 중입니다.");
    }
}
