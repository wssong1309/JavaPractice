package ClassExample.java_12.lambda03;

public class OneParamReturnTest {
    // [3] One parameter, return
    public static void main(String[] args) {
        LengthCount lc;

        lc = s -> s.length();
        System.out.println(lc.len("School of SmartIT!!"));
    }
}
