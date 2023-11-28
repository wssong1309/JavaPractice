package ClassExample.java_11.dequequeue;

public class DequeQueueTest {
    public static void main(String[] args) {
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();
        QueueTicketDispenser.takeNum();

        System.out.println("첫 번째 손님은 " + Restaurant.firstGuest() + "번 입니다.");
        
        Restaurant.printQueue();
        
        while (Restaurant.q.size() > 0) {
            Restaurant.serving();
        }
        
        Restaurant.printQueue();
    }
}