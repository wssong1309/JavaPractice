package ClassExample.java_11.dequequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Restaurant {
    // static field. 대기번호를 저장한다.
    public static Deque<Integer> q = new ArrayDeque<>();

    // 제일 앞 대기번호를 꺼내고 서빙한다는 메시지를 보낸다.
    public static void serving() {
        int num = q.poll();
        System.out.println(num + "번 손님에게 서빙되었습니다.");
    }

    // 대기열에 있는 번호를 전부 출력한다.
    public static void printQueue() {
        System.out.println("대기열\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Iterator<Integer> it = q.iterator(); it.hasNext();) {
            int num = it.next();
            System.out.println(num + "번 손님");
        }
        System.out.println();
    }

    // 제일 앞 대기번호를 return한다.
    public static int firstGuest() {
        return q.peek();
    }
}
