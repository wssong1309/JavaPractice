package ch08.practice01;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle circle = (Circle) obj;
            if (this.radius == circle.radius) {
                return true;
            }
        }
        return false;
    }
}
