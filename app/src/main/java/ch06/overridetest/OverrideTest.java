package ch06.overridetest;

class Vehicle {
    private String color;
    private int speed;
    public String getColor() {
        return color;
    }
    public int getSpeed() {
        return speed;
    }
    public Vehicle (String color, int speed) {
        this.color = color;
        this.speed = speed;
    }
    public String show() {
        return "색상: " + color + " 속도: " + speed;
    }
}

class Car extends Vehicle{
    private int displacement;
    private int gears;
    public int getDisplacement() {
        return displacement;
    }
    public int getGears() {
        return gears;
    }
    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.displacement = displacement;
        this.gears = gears;
    }
    public String show() {
        return "색상: " + getColor() + " 속도: " + getSpeed() + " 자동차 배기량: " + displacement + " 자동차 기어 단수: " + gears;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Car c = new Car("파랑", 200, 1000, 5);
        System.out.println(c.show());

        System.out.println();
        Vehicle v1 = c;
        System.out.println(v1.show());
    }
}
