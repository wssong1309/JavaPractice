package ch06.circletest01;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    
    public void show() {
        System.out.println("반지름이 " + getRadius() + "인 원이다.");
    }
}
