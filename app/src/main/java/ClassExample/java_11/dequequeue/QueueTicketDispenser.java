package ClassExample.java_11.dequequeue;

public class QueueTicketDispenser {
    // Field. ���������� 1��부터 뽑���다.
    private static int num = 1;

    // Method. Restaurant class��� static field��� q�� num��� 넣고 num��� 1 ��가��킨다. num��� 1 ��가��다��� 것��� �������를 ���� 뽑��다��� 것.
    public static int takeNum() {
        Restaurant.q.offer(num);
        return num++;
    }
}
