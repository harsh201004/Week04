package collections.listinterface.nthelementfromtheend;
import java.util.*;

public class FindNthFromEnd {

    public static String nthFromEnd(LinkedList<String> list, int n) {
        if (list == null || n <= 0) {
            return "Invalid input";
        }

        Iterator<String> fast = list.iterator();
        Iterator<String> slow = list.iterator();

        // Move the fast pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                return "N is greater than the list size";
            }
            fast.next();
        }

        // Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // The slow pointer is now at the Nth element from the end
        return slow.next();
    }
}
