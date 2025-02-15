package collections.setinterface.convertsetintosortedlist;
import java.util.*;

public class HashsetToSortedListMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Enter elements for the Set (type 'done' to stop):");
        while (input.hasNextInt()) {
            set.add(input.nextInt());
        }
        input.next();


        List<Integer> sortedList = HashsetToSortedList.convertToSortedList(set);

        System.out.println("Sorted List: " + sortedList);
    }
}
