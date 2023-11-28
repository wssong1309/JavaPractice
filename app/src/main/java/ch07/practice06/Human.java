package ch07.practice06;

public interface Human {
    void eat();

    public default void print() {
        System.out.println("인간입니다.");
    }

    public static void echo() {
        System.out.println("야호!!!");
    }
}
