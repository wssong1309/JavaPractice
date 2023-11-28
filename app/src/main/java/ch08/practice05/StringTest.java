package ch08.practice05;

public class StringTest {
    public static void show(Object o) {
        System.out.println(o.toString());
    }
    public static void main(String[] args) {

        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
        // show(new Date());
    }
}
