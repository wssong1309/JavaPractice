package ch08.practice08;

import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class StringTokenizerTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        System.out.println(st.countTokens());
        String[] phrase = new String[st.countTokens()];

        while (st.hasMoreTokens())
            phrase[i++] = st.nextToken();
        i = 0;
        Arrays.sort(phrase);

        while (i < 6)
            System.out.print(phrase[i++] + ", ");

        sc.close();
    }
}
