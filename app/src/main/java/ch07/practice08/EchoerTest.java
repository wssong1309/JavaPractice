package ch07.practice08;

import java.util.Scanner;

public class EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echoer e = new Echoer() {
            void echo() {
                String input = in.nextLine();
                System.out.println(input);
                while (input.compareTo("끝") != 0) {
                    input = in.nextLine();
                    System.out.println(input);
                }
                // do {
                //     String input = in.nextLine();
                //     System.out.println(input);
                // } while (input.compareTo("끝"));
            }
        };
        e.start();
        e.echo();
        e.stop();
        in.close();
    }
}
