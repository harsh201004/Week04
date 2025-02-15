package collections.queueinterface.reversethequeue;

import java.util.*;

public class ReverseQueueMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter elements for the Queue (type 'done' to stop):");
        while (input.hasNextInt()) {
            queue.add(input.nextInt());
        }
        input.next();

        System.out.println("Original Queue: " + queue);


        ReverseQueue.reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}
