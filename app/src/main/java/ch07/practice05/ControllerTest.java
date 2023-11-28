package ch07.practice05;

abstract class Controller {
    boolean power;
    public void show() {
        if (power) {
            System.out.println(getName() + "가 켜졌습니다.");
        } else {
            System.out.println(getName() + "가 꺼졌습니다.");
        }
    }
    abstract String getName();
}
class TV extends Controller {
    public TV(boolean p) {
        super.power = p;
    }
    public String getName() { return "TV"; }
}
class Radio extends Controller {
    public Radio(boolean p) {
        super.power = p;
    }
    public String getName() { return "Radio"; }
}

public class ControllerTest {
    public static void main(String[] args) {
        Controller[] c = { new TV(false), new Radio(true) };

        for (Controller controller : c) {
            controller.show();
        }
    }
}
