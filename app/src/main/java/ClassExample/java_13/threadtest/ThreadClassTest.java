package ClassExample.java_13.threadtest;

// [1] Thread Class�� Inheritance�Ͽ� �����ϴ� ��� (X)
class NewThread extends Thread { // Thread Class�� Inheritance�� Class�� run method�� override �ؾ��Ѵ�.
    private int number = 0;

    public NewThread(int n) { // Constructor
        System.out.println(this.getName() + " : Thread ����\n");
        number = n;
    }

    public void run() {
        int i = 0;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        while (i < number) {
            // Thread body
            System.out.println(this.getName() + " : " + i + "\n");
            i++;
        }
        System.out.println(this.getName() + " : Thread ����");
    }
}

public class ThreadClassTest {
    public static void main(String[] args) {
        // (1) nt NewThread object ����
        NewThread nt = new NewThread(5);
        
        // (2) nt object���� start() ȣ��
        nt.start();
    }
}
