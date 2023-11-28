package ClassExample.java_13.threadtest;

// [1] Thread Class를 Inheritance하여 구현하는 방법 (X)
class NewThread extends Thread { // Thread Class를 Inheritance한 Class는 run method를 override 해야한다.
    private int number = 0;

    public NewThread(int n) { // Constructor
        System.out.println(this.getName() + " : Thread 시작\n");
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
        System.out.println(this.getName() + " : Thread 종료");
    }
}

public class ThreadClassTest {
    public static void main(String[] args) {
        // (1) nt NewThread object 생성
        NewThread nt = new NewThread(5);
        
        // (2) nt object에서 start() 호출
        nt.start();
    }
}
