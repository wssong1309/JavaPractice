package ch07.controllabletest;

public class Computer implements Controllable{

    @Override
    public void turnOff() {
        System.out.println("컴퓨터를 끈다.");
    }

    @Override
    public void turnOn() {
        System.out.println("컴퓨터를 켠다.");
    }
    
}
