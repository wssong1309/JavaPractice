package ClassExample.java_12.lambda02;

public class TwoParamsNoReturnTest {
    // [2] Two parameters, Void return
    public static void main(String[] args) {
        Calculator cal;

        cal = (x, y) -> System.out.println(x + y);
        cal.cal(3, 9);

        cal = (x, y) -> System.out.println(x - y);
        cal.cal(9, 3);

        cal = (x, y) -> System.out.println(x * y);
        cal.cal(9, 3);

        cal = (x, y) -> System.out.println(x / y);
        cal.cal(9, 3);
    }
}
