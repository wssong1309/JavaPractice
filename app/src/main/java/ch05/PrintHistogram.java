package ch05;
import java.util.*;

public class PrintHistogram {
    public static void main(String[] args) {
        int num, i, j;
        Scanner in = new Scanner(System.in);
        int[] cnt = new int[10];

        System.out.println("숫자를 10개 입력하세요.");
        for (i = 0; i < 10; i++) {
            num = in.nextInt();
            if (num < 0) continue;
            cnt[num/10] += 1;
        }
        for (j = 0; j < 10; j++) {
            System.out.printf("%2d ~ %2d : %s\n", j*10, j*10+9, "*".repeat(cnt[j]));
        }
    }
}
