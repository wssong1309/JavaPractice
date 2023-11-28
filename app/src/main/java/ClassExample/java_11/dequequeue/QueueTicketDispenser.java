package ClassExample.java_11.dequequeue;

public class QueueTicketDispenser {
    // Field. ë²ÿíÿ¸í‘ÿëÿ” 1ë²ÿë¶€í„° ë½‘ëÿ”ë‹¤.
    private static int num = 1;

    // Method. Restaurant classìÿÿ static fieldìÿ¸ qì—ÿ numìÿ„ ë„£ê³  numìÿ„ 1 ì¦ÿê°€ì‹ÿí‚¨ë‹¤. numìÿ´ 1 ì¦ÿê°€í–ÿë‹¤ëÿ” ê²ƒìÿ€ ë²ÿíÿ¸í‘ÿë¥¼ í•ÿë‚ÿ ë½‘ì•ÿë‹¤ëÿ” ê²ƒ.
    public static int takeNum() {
        Restaurant.q.offer(num);
        return num++;
    }
}
