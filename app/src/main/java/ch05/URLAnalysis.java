package ch05;
import java.util.Scanner;

public class URLAnalysis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String url;
        do {
            System.out.print("URL을 입력하세요 : ");
            url = in.nextLine();
            if (url.endsWith("com")) {
                System.out.println(url + "는(은) com으로 끝납니다.");
            }
            if (url.contains("java")) {
                System.out.println(url + "는(은) java를 포함합니다.");
            }
        } while (!url.equals("bye"));
        in.close();
    }
}