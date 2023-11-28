package ch05;

public class EnumTest_ {
    public static void main(String[] args) {
        for (Direction d : Direction.values())
            System.out.print(d + " ");
    }
}

enum Direction {
    EAST("동"), WEST("서"), SOUTH("남"), NORTH("북");

    private String d;

    private Direction(String d) {
        this.d = d;
    }
    
    public String toString() {
        return d;
    }
}