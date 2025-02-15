package collections.setinterface.aresetsequal;
import java.util.*;

public class AreSetsEqualMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements for Set 1 (type 'done' to stop) if all elements are entered: ");
        while (input.hasNextInt()) {
            set1.add(input.nextInt());
        }
        input.next();

        System.out.println("Enter elements for Set 2 (type 'done' to stop) if all elements are entered: ");
        while (input.hasNextInt()) {
            set2.add(input.nextInt());
        }

        AreSetsEqual checker = new AreSetsEqual();
        boolean result = checker.areSetsEqual(set1, set2);

        System.out.println("Are the two sets equal? " + result);
    }
}
