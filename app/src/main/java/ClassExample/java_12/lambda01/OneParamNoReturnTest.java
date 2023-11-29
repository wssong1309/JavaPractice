package ClassExample.java_12.lambda01;

public class OneParamNoReturnTest {
    // [1] One Parameter, Void return
    public static void main(String[] args) {
        Printable p;
        
        // (1) ���� ���� ǥ��
        p = (String s) -> {System.out.println(s);};
        p.print("ȯ���մϴ�. Lambda Expression����(1) �Դϴ�.\n");

        // (2) ���๮�� �ϳ��� �����ϸ� �߰�ȣ ���� ����
        p = (String s) -> System.out.println(s);
        p.print("ȯ���մϴ�. Lambda Expression����(2) �Դϴ�.\n");

        // (3) �Ű������� �ϳ��� �����ϸ� �Ű����� Ÿ�� ���� ����
        p = (s) -> System.out.println(s);
        p.print("ȯ���մϴ�. Lambda Expression����(3) �Դϴ�.\n");

        // (4) �Ű������� �ϳ��� �����ϸ� �Ұ�ȣ ���� ����
        p = s -> System.out.println(s);
        String s = "ȯ���մϴ�. Lambda Expression����(4) �Դϴ�.";
        p.print(s + "\n");
    }
}
 /*
  * - �� ����� �����غ� lambda expression
  * �ϴ� FunctionalInterface��°� "�� �Լ��� � ����� �� �Ŵ�"��� �������� ������ �̸����� ǥ���س�����
  * lambda expression���� ���� �� interface�� � ����� �������� �����ϴ°�
  * ���� ���뼺 �ִ� �ڵ��� ����������.
  */