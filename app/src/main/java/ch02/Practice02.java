package ch02;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int a = in.nextInt();
        System.out.println(a + "의 제곱은 " + a*a);
        
        in.close();
    }
}
