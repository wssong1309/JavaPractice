package ClassExample.java_12.lambda01;

public class OneParamNoReturnTest {
    // [1] One Parameter, Void return
    public static void main(String[] args) {
        Printable p;
        
        // (1) 줄임 없이 표현
        p = (String s) -> {System.out.println(s);};
        p.print("환영합니다. Lambda Expression과정(1) 입니다.\n");

        // (2) 실행문이 하나만 존재하면 중괄호 생략 가능
        p = (String s) -> System.out.println(s);
        p.print("환영합니다. Lambda Expression과정(2) 입니다.\n");

        // (3) 매개변수가 하나만 존재하면 매개변수 타입 생략 가능
        p = (s) -> System.out.println(s);
        p.print("환영합니다. Lambda Expression과정(3) 입니다.\n");

        // (4) 매개변수가 하나만 존재하면 소괄호 생략 가능
        p = s -> System.out.println(s);
        String s = "환영합니다. Lambda Expression과정(4) 입니다.";
        p.print(s + "\n");
    }
}
 /*
  * - 내 맘대로 이해해본 lambda expression
  * 일단 FunctionalInterface라는건 "이 함수가 어떤 기능을 할 거다"라는 포괄적인 내용을 이름으로 표시해놓은것
  * lambda expression으로 실제 이 interface가 어떤 기능을 수행할지 구현하는것
  * 더욱 범용성 있는 코딩이 가능해진다.
  */