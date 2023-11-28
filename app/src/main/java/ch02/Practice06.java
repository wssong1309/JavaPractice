package ch02;
import java.util.Scanner;

public class Practice06 {
    public static void main(String[] args) {
        Scanner temperature = new Scanner(System.in);
        System.out.print("화씨온도를 입력하세요. ");
        double temp = temperature.nextInt();
        System.out.printf("화씨 %f도는 섭씨 %f도 입니다.", temp, (double)5/9*(temp-32));

        temperature.close();
    }
}
