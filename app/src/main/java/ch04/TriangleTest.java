package ch04;

class Triangle{
    private double base, height;
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double findArea() {
        return (base * height / 2);
    }
    public boolean isSameArea(Triangle t) {
            return (this.findArea() == t.findArea());
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(10.0, 5.0);
        Triangle t2 = new Triangle(5.0, 10.0);
        Triangle t3 = new Triangle(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
