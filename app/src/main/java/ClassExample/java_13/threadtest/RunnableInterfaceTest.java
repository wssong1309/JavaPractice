package ClassExample.java_13.threadtest;

// [2] Runnable Interface를 implement하여 구현하는 방법 (O)

class NewRunnable implements Runnable { // 1.Runnable 인터페이스를 구현하는 클래스 정의
	private int number = 0;

	public NewRunnable(int n) {
		System.out.println("Thread-0 : Thread 시작\n");
		number = n;
	}

	@Override
	public void run() { // 2.run()메소드 오버라이드 및 스레드 코드 작성
		int i = 0;
		while (i < number) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			// Thread body
			System.out.println("Thread-0 : " + i + "\n");
			i++;
		}
		System.out.println("Thread-0 : Thread 종료");
	}
}

public class RunnableInterfaceTest {
	public static void main(String[] args) {
		// (3) Runnable object nr 생성
		Runnable nr = new NewRunnable(5);

		// (4) Runnable object nr을 이용해 Thread object t 생성
		Thread t = new Thread(nr);

		// (5) Thread 실행
		t.start();
	}
}
