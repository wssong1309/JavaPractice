package ch06.pointertest03;

public class PointTest {
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        MovablePoint mp = new MovablePoint(10, 20, 1, 5);

        p.pointerProperty();
        mp.pointerProperty();
    }
}
