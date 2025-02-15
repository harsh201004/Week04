package collections.setinterface.subsetofset;
import java.util.*;

public class IsSubsetMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        System.out.println("Enter elements for Set 1 (type 'done' to stop):");
        while (input.hasNextInt()) {
            set1.add(input.nextInt());
        }
        input.next();

        System.out.println("Enter elements for Set 2 (type 'done' to stop):");
        while (input.hasNextInt()) {
            set2.add(input.nextInt());
        }

        boolean isSubset = IsSubset.isSubset(set1, set2);

        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}
