package ch02;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 한 개 입력하세요. ");
        int number = in.nextInt();
        System.out.println(number % 4 == 0 && number % 5 == 0);
        System.out.println(number % 4 == 0 || number % 5 == 0);
        System.out.println((number % 4 == 0 && number % 5 == 0) ^ (number % 4 == 0 || number % 5 == 0));

        in.close();
    }
}
