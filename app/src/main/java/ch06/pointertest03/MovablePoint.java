package ch06.pointertest03;

public class MovablePoint extends Point{
    private int xSpeed, ySpeed;

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void pointerProperty() {
        System.out.println("포인터의 현재 좌표 : " + getX() + ", " + getY() + "\n포인터의 이동속도 : xSpeed - " + getxSpeed() + " ySpeed - " + getySpeed());
    }
}
