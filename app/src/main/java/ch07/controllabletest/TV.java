package ch07.controllabletest;

public class TV implements Controllable {

    @Override
    public void turnOff() {
        System.out.println("TV를 끈다.");
    }

    @Override
    public void turnOn() {
        System.out.println("TV를 켠다.");
    }
    
}
