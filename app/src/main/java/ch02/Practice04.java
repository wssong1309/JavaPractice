package ch02;
import java.util.Scanner;

public class Practice04{
    public static void main(String[] args) {
        System.out.print("초 단위 정수를 입력하세요 : ");
        Scanner time = new Scanner(System.in);
        int second = time.nextInt();
        System.out.printf("%d시간 %d분 %d초", second/60/60, second/60%60, second%60);
        
        time.close();
    }
}