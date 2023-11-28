package ch02;
import java.util.Scanner;

public class Practice03{
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Scanner h = new Scanner(System.in);
        System.out.print("원기둥의 밑면 반지름은? ");
        double radius = r.nextInt();
        System.out.print("원기둥의 높이는? ");
        double height = h.nextInt();
        System.out.println("원기둥의 부피는 " + radius*radius*3.14*height);

        r.close();
        h.close();
    }
}