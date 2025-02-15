package collections.setinterface.unionandintersectionoftwosets;
import java.util.*;

public class SetMain {
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

        HashSet<Integer> union = UnionOfSets.findUnion(set1, set2);
        HashSet<Integer> intersection = IntersectionOfSets.findIntersection(set1, set2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
