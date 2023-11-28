package ch07.practice07;

public class FlyableTest {
    public static void main(String[] args) {
        Flyable f = new Flyable() {

            @Override
            public void height() {
                System.out.println("높이");
            }

            @Override
            public void speed() {
                System.out.println("속도");
            }

        };
        f.speed();
        f.height();
    }
}
