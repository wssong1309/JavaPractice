package ch07.practice04;

interface Talkable {
    String talk();
}
class Korean implements Talkable {
    public String talk() {
        return "안녕하세요!";
    }
}
class American implements Talkable {
    public String talk() {
        return "Hello!";
    }
}

public class TalkableTest {
    static void speak(Talkable t) {
        System.out.println(t.talk());
    }
    public static void main(String[] args) {
        speak(new Korean());
        speak(new American());
    }
}
