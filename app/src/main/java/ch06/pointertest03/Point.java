package ch06.pointertest03;

public class Point {
    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void pointerProperty() {
        System.out.println("포인터의 현재 좌표 : " + x + ", " + y);
    }
}
