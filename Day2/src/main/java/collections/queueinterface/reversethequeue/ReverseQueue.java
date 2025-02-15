package collections.queueinterface.reversethequeue;
import java.util.*;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }
}
