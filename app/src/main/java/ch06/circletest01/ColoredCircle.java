package ch06.circletest01;

public class ColoredCircle extends Circle{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ColoredCircle(int radius, String color) {
        super(radius);
        this.color = color;
    }
    
    public void show() {
        System.out.println("반지름이 " + getRadius() + "인 " + getColor() + " 원이다.");
    }
}
