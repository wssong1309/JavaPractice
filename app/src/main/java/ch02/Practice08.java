package ch02;

import java.util.*;

public class Practice08 {
    public static void main(String[] args) {
        int hundred, ten, one;
        Scanner in = new Scanner(System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요: ");
        int number = in.nextInt();
        hundred = number/100;
        ten = (number-hundred*100)/10;
        one = number-hundred*100-ten*10;
        System.out.println("각 자릿수의 합 = " + (hundred+ten+one));
        in.close();
    }
}
