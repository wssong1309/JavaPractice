package ch07.controllabletest;

public class ControllableDemo {
    public static void main(String[] args) {
        Controllable[] controllable = { new TV(), new Computer(), new Notebook()};

        for (Controllable c : controllable) {
            c.turnOn();
            c.turnOff();
            c.repair();
        }

        Controllable.reset();
    }
}
