package collections.setinterface.convertsetintosortedlist;
import java.util.*;

public class HashsetToSortedList {
    public static List<Integer> convertToSortedList(HashSet<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set); // Convert HashSet to List
        Collections.sort(sortedList);
        return sortedList;
    }
}
