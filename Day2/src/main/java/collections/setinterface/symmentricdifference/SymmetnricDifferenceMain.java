package collections.setinterface.symmentricdifference;
import java.util.*;

public class SymmetnricDifferenceMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        System.out.print("Enter elements for Set 1 if you enter all elements then type 'done' to stop: ");
        while (input.hasNextInt()) {
            set1.add(input.nextInt());
        }
        input.next();

        System.out.println("Enter elements for Set 2 if you enter all the elements then type 'done' to stop: ");
        while (input.hasNextInt()) {
            set2.add(input.nextInt());
        }

        HashSet<Integer> symmetricDifference = SymmentricDifference.findSymmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}
