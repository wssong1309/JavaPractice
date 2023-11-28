package ch04;

class Line {
    private int length;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public Line(int length) {
        this.length = length;
    }
    public boolean isSameLine(Line l) {
        return (this.length == l.length);
    }
}

public class LineTest {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}
